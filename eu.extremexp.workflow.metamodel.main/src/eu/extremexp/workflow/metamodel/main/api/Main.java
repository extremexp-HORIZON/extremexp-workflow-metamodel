package eu.extremexp.workflow.metamodel.main.api;


//import eu.extremexp.workflow.metamodel.main.api.ModelIO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@SpringBootApplication
@RestController
public class Main {

    private final ModelIO io;

    public Main() {
        // Register your EMF model here (replace with your actual package if different)
        this.io = new ModelIO(ModelIO.registerMainModel());
    }

    /**
     * Convert JSON to XMI (model instance).
     */
    @PostMapping(
        value = "/convert_to_model",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_XML_VALUE
    )
    public String convertToModel(@RequestBody String json) {
        return io.jsonToXmi(json);
    }

    /**
     * Convert XMI to JSON.
     */
    @PostMapping(
        value = "/convert_from_model",
        consumes = MediaType.APPLICATION_XML_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String convertFromModel(@RequestBody String xmi) {
        return io.xmiToJson(xmi);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
