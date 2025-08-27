package eu.extremexp.workflow.metamodel.main.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.emfjson.resource.JsonResourceFactoryImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Usage:

ModelIO io = new ModelIO(ModelIO.registerMainModel());
String xmi = io.jsonToXmi("{\"eClass\":\"http://your/nsURI#//Root\",\"name\":\"Example\"}");
String json = io.xmiToJson(xmi);

Dependencies:
- org.eclipse.emf:org.eclipse.emf.ecore
- org.eclipse.emf:org.eclipse.emf.ecore.xmi
- org.emfjson:emfjson-jackson
*/


public final class ModelIO {

    private final ResourceSet rs;

    public ModelIO(Runnable registerPackages) {
        this.rs = new ResourceSetImpl();
        this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactoryImpl());

        this.rs.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), URI.createURI("memory:/"));
        this.rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/"), URI.createURI("memory:/"));

        if (registerPackages != null) {
            registerPackages.run();
        }
    }

    public String jsonToXmi(String json, Map<Object, Object> options) {
        if (json == null) throw new IllegalArgumentException("json is null");
        URI jsonUri = URI.createURI("memory:/in.json");
        Resource jsonRes = rs.createResource(jsonUri);
        try (InputStream in = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8))) {
            jsonRes.load(in, jsonLoadOptions());
        } catch (Exception e) {
            throw new RuntimeException("Failed to load JSON into EMF: " + e.getMessage(), e);
        }

        if (jsonRes.getContents().isEmpty()) {
            throw new IllegalStateException("JSON produced no EMF contents. Ensure type information (eClass) is present.");
        }

        URI xmiUri = URI.createURI("memory:/out.xmi");
        Resource xmiRes = rs.createResource(xmiUri);
        xmiRes.getContents().addAll(jsonRes.getContents());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            xmiRes.save(out, xmiSaveOptions(options));
        } catch (Exception e) {
            throw new RuntimeException("Failed to save XMI: " + e.getMessage(), e);
        }
        return out.toString(StandardCharsets.UTF_8);
    }

    public String xmiToJson(String xmi, Map<Object, Object> options) {
        if (xmi == null) throw new IllegalArgumentException("xmi is null");
        URI xmiUri = URI.createURI("memory:/in.xmi");
        Resource xmiRes = rs.createResource(xmiUri);
        try (InputStream in = new ByteArrayInputStream(xmi.getBytes(StandardCharsets.UTF_8))) {
            xmiRes.load(in, Collections.emptyMap());
        } catch (Exception e) {
            throw new RuntimeException("Failed to load XMI: " + e.getMessage(), e);
        }

        if (xmiRes.getContents().isEmpty()) {
            throw new IllegalStateException("XMI has no contents.");
        }

        URI jsonUri = URI.createURI("memory:/out.json");
        Resource jsonRes = rs.createResource(jsonUri);
        jsonRes.getContents().addAll(xmiRes.getContents());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            jsonRes.save(out, jsonSaveOptions(options));
        } catch (Exception e) {
            throw new RuntimeException("Failed to save JSON: " + e.getMessage(), e);
        }
        return out.toString(StandardCharsets.UTF_8);
    }

    public EObject newInstance(String ePackageNsURI, String eClassName) {
        EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ePackageNsURI);
        if (pkg == null) throw new IllegalArgumentException("No EPackage for nsURI: " + ePackageNsURI);
        EClassifier cls = pkg.getEClassifier(eClassName);
        if (!(cls instanceof EClass)) throw new IllegalArgumentException("No EClass named '" + eClassName + "' in " + ePackageNsURI);
        return pkg.getEFactoryInstance().create((EClass) cls);
    }

    private Map<Object, Object> xmiSaveOptions(Map<Object, Object> extra) {
        Map<Object, Object> opts = new HashMap<>();
        opts.put(XMLResource.OPTION_ENCODING, "UTF-8");
        opts.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        opts.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
        if (extra != null) opts.putAll(extra);
        return opts;
    }

    private Map<Object, Object> jsonSaveOptions(Map<Object, Object> extra) {
        Map<Object, Object> opts = new HashMap<>();
        if (extra != null) opts.putAll(extra);
        return opts;
    }

    private Map<Object, Object> jsonLoadOptions() {
        return new HashMap<>();
    }

    public String jsonToXmi(String json) {
        return jsonToXmi(json, null);
    }

    public String xmiToJson(String xmi) {
        return xmiToJson(xmi, null);
    }

    public static Runnable registerMainModel() {
        return () -> {
            try {
                Class<?> pkgClass = Class.forName("eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage");
                pkgClass.getField("eINSTANCE").get(null);
            } catch (Exception e) {
                throw new RuntimeException("Could not initialize WorkflowPackage. Ensure generated model is on the classpath.", e);
            }
        };
    }
}


