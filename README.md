# ExtremeXP Workflow Meta-model

An Eclipse Modeling Framework (EMF) based metamodel for defining scientific workflows, experiments, and computational tasks. This project provides a comprehensive domain model for workflow composition, experiment design, and task orchestration in scientific computing environments.

## Overview

The EXTREMEXP Workflow Metamodel enables the definition and manipulation of:

- **Workflows**: Composite and assembled workflows with data flow and control flow semantics
- **Tasks**: Abstract and concrete computational tasks with inputs, outputs, parameters, and metrics
- **Operators**: Parallel, exclusive, inclusive, and join operators for workflow control flow
- **Experiments**: Experiment spaces with task configurations and parameter exploration strategies
- **Links**: Data links, control links, conditional links, and exceptional links for task orchestration
- **Type System**: Parameters, structures, arrays, and primitive types for data modeling

## Features

- **EMF-based modeling**: Built on Eclipse Modeling Framework for model-driven development
- **Workflow composition**: Support for hierarchical workflow composition and task substitution
- **Experiment design**: First-class support for parameter spaces and experiment configurations
- **Type-safe parameters**: Rich type system including primitives, structures, and arrays with constraints
- **Flexible control flow**: Multiple control flow patterns including parallel, conditional, and exceptional flows
- **Metadata support**: Extensible metadata for tasks, groups, and workflow elements
- **Code generation**: Automatic Java code generation from Ecore models

## Project Structure

```
├── model/                  # EMF models
│   ├── workflow.ecore     # Core metamodel definition
│   ├── workflow.genmodel  # Code generation configuration
│   └── workflow.aird      # Sirius diagram representation
├── src-gen/               # Generated Java code
│   └── eu/extremexp/emf/model/workflow/
├── META-INF/              # Eclipse plugin metadata
├── icons/                 # UI icons
├── pom.xml               # Maven build configuration
└── plugin.xml            # Eclipse plugin configuration
```

## Core Concepts

### Workflow Types

- **CompositeWorkflow**: Workflows composed of nodes and links
- **AssembledWorkflow**: Workflows with task substitutions based on a parent workflow
- **TaskSpecification**: Workflow specifications with implementation details, parameters, and metrics

### Node Types

- **Task**: Computational units with inputs, outputs, parameters, and optional primitive implementations
- **Operator**: Control flow operators (Parallel, Exclusive, Inclusive, Join)
- **Event**: Workflow events (START, END)

### Link Types

- **DataLink**: Connects data inputs and outputs between tasks
- **RegularLink**: Standard control flow links
- **ConditionalLink**: Condition-based control flow
- **ExceptionalLink**: Exception handling control flow
- **ControlLink**: Links for experiment control flow

### Type System

- **PrimitiveType**: NUMBER, BOOLEAN, STRING, BLOB
- **Structure**: Named fields with types
- **Array**: Fixed-length arrays of types
- **ParameterType**: Abstract base for all types

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- Eclipse IDE with EMF SDK (for model editing)

### Building the Project

```bash
mvn clean install
```

This will:
1. Compile the generated Java sources from the Ecore model
2. Package the metamodel as a JAR
3. Generate the metamodel classes in `target/`

### Using the Metamodel

#### Creating a Workflow Programmatically

```java
import eu.extremexp.emf.model.workflow.*;

// Create a workflow factory
WorkflowFactory factory = WorkflowFactory.eINSTANCE;

// Create a composite workflow
CompositeWorkflow workflow = factory.createCompositeWorkflow();
workflow.setName("MyWorkflow");

// Create tasks
Task task1 = factory.createTask();
task1.setName("DataPreprocessing");

Task task2 = factory.createTask();
task2.setName("Analysis");

// Add tasks to workflow
workflow.getNode().add(task1);
workflow.getNode().add(task2);

// Create a link between tasks
RegularLink link = factory.createRegularLink();
link.setOutput(task1);
link.setInput(task2);
workflow.getLinks().add(link);
```

#### Defining Parameters

```java
// Create a parameter with a primitive type
Parameter param = factory.createParameter();
param.setName("threshold");

PrimitiveType type = factory.createPrimitiveType();
type.setType(Primitive.NUMBER);
param.setType(type);

param.setDefaultValue("0.5");
```

## Dependencies

- **Eclipse EMF Core** (2.26.0): Core modeling framework
- **Eclipse EMF Codegen** (2.39.0): Code generation
- **Eclipse EMF XMI** (2.38.0): XMI serialization
- **Eclipse MWE2** (2.20.0): Model workflow engine
- **Jackson Core** (2.18.1): JSON processing

## Maven Coordinates

```xml
<dependency>
    <groupId>eu.extremexp.emf.model</groupId>
    <artifactId>eu.extremexp.emf.model</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## Eclipse Plugin

The project can be used as an Eclipse plugin with:
- **Bundle-SymbolicName**: `eu.extremexp.emf.model`
- **Bundle-Version**: 0.1.0.qualifier
- **Required Execution Environment**: JavaSE-21
