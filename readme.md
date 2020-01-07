# Clean Code

## Legend
### DO
### --- DON'T ---

## Why clean code?
- If it can be understood easily by everyone on the team.
    - Readability
    - Changeability
    - Extensibility
    - Maintainability
- All the things need to keep going over a long time without accumulating up a large technical debt.
- Writing clean code from the start in a project is an investment in keeping the cost of change as constant as possible throughout the lifecycle of a software product.
- Unclean code results in technical debt that increases over time if not refactored into clean code.
- There are other reasons leading to Technical debt such as bad process and lack of documentation.     

### In Clean code, Bugs can't hide.
- Most software defects are introduced when changing the existing code.
    - changing the code can't grasp the effects of the changes code.
    - Clean code minimises risk.

## Principles
### Loose coupling
- Two classes are coupled when at least one of them uses the other.
- The less these items know about each other, the looser they are coupled.
- A component that is only loosely coupled to its environment can be more easily changed or replaced than a strongly coupled component.

### High Cohesion
- Cohesion is the degree to which elements of whole belong together.
- Methods and fields in a single class and classes of a component should have high cohesion.
- Easy to understand code structure and design.

### Change is local
- When a software system has to be maintained, extended and changed for a long time, keep change local reduces involved costs and risks.

### It is easy to remove
- We normally build software by adding, extending or chaining features.
    - However, removing elements is important so that the overall design can be kept as simple as possible.
    - When block gets too complicated, it has to be removed and replaced with one or more simpler blocks.
 
### Mid-sized components
- Break your system down into components that are of a size you can grasp within your mind so that you can predict consequences of changes easily.
    - Dependencies, control flow
    
## --- Smells
### --- Rigity ---
- The software is difficult to change. A small change causes a cascade of subsequent changes.

### --- Fragility ---
- The software breaks in many places due to a single change.

### --- Immobility ---
- You cannot reuse parts of the code in other projects because of involved risks and high effort.

### --- Viscosity of Design ---
- Taking a shortcut and introducing technical debt requires less effort than doing it right.

### --- Viscosity of Environment ---
- Building, testing and other tasks take a long time. Therefore, these activities are not executed properly by everyone and technical debt is introduced.

### --- Needless Complexity ---
- The design contains elements that are currently not useful. The added complexity makes the code harder to comprehend. Therefore, extending and changing the code results in higher effort than necessary.

### --- Needless Repetition ---
- Code contains exact code duplications or design duplicates (doing the same thing in a different way)
- Making a change to a duplicated piece of code is more expensive and more error-prone because the change has to be made is several places with the risk that one place is not changed accordingly.

### --- Opacity ---
- The code is hard to understand. Therefore, any change takes additional time to first re-engineer the the code and is more likely to result in defects due to not understanding the side effects.

## Class Design
### Single Responsibility Principle (SRP)
- A class should have one, and only one, reason to change.

### Open Closed Principle (OCP)
- You should be able to extend a classes behaviour without modifying it.

### Liskov Substitution Principle (LSP)
- Derived classes must be substitutable for their base classes.

### Dependency Inversion Principle (DIP)
- Depend on abstractions, not on concretes.

### Interface Segregation Principle (ISP)
- Make fine grained interfaces that are client specific.

### Classes should be small
- Smaller classes are easier to grasp.
- Classes should be smaller than 100 lines.

### Do stuff or know others, but not both
- Classes should either do stuff(algorithm, read data, write data, ...) or orchestrate other classes.
- This reduces coupling and simplifies testing.

## Package Cohesion
### Release Reuse Equivalency Principle (RREP)
- The granule of reuse is the granule of release.

### Common Closure Principle (CCP)
- Classes that change together are packaged together.

### Common Reuse Principle (CRP)
- Classes that are used together are packaged together.

## Package Coupling
### Acyclic Dependencies Principle (ADP)
- The dependency graph of packages must have no cycles

### Stable Dependencies Principle (SDP)
- Depend in the direction of stability.

### Stable Abstractions Principle (SAP) 
- Abstractness increases with stability.
- More stable a package is, the more abstract it should be.

## General
### Follow Standard Conventions 
- CodingXXX, architectureXXX, design guidelinesXXX
    - Validate them with tools.
    
### Keep it Simple, Stupid (KISS)
- Simpler is always better. Reduce complexity as much as possible.

### Boy Scout Rule
- Leave the campground cleaner than you found it.

### Root Cause Analysis
- Always look for the root cause of a problem. Otherwise, it will get you again.

## Environment
### Project Build Requires Only One Step 
- Check out and then build with a single command.

### Executing Tests Requires Only One Step
- Run all unit tests with a single command.

### Source Control System
- Always use a source control system.

### Continuous Integration
- Assure integrity with Continuous Integration

### --- Overridden Safeties ---
- Do not override warnings, errors, exception handling.

## Dependency Injection
### Decouple Construction from Runtime
- Decoupling the construction phase completely from the runtime helps to simplify the runtime behaviour.

## Design
### Keep Configurable Data at High Levels
- Keep all constants, read-only, variables and other configurable data at one position and that is at top position.
- Expose it as an argument to the low-level function called from the high-level function.

### Don’t Be Arbitrary
- Have a reason for the way you structure your code, and make sure that reason is communicated by the structure of the code.
- If a structure appears arbitrary, others will feel empowered to change it.

### Be Precise
- When you make a decision in your code, make sure you make it precisely. Know why you have made it and how you will deal with any exceptions.

### Structure over Convention
- Enforce design decisions with structure over convention. Naming conventions are good, but they are inferior to structures that force compliance.

### Prefer Polymorphism To If/Else or Switch/Case 
- “ONE SWITCH”: There may be no more than one switch statement for a given type of selection.
-  The cases in that switch statement must create polymorphic objects that take the place of other such switch statements in the rest of the system.

### Symmetry / Analogy
- Favour symmetric designs (e.g. Load – Save) and designs that follow analogies.

### Separate Multi-Threading Code
- Do not mix code that handles multi-threading aspects with the rest of the code. Separate them into different classes.

### --- Misplaced Responsibility ---
- Something put in the wrong place.

### --- Code at Wrong Level of Abstraction ---
- Functionality is at wrong level of abstraction
    - Stack<T> with PercentageFull state.

### --- Fields Not Defining State ---
- Fields holding data that does not belong to the state of the instance but are used to hold temporary data.
- Use local variables or extract to a class abstracting the performed action.

### --- Over Configurability ---
- Prevent configuration just for the sake of it.
- Nobody can decide how it should be. Otherwise, this will result in overly complex, unstable systems.

### --- Micro Layers ---
- Do not add functionality on top, but simplify overall.

## Dependencies
### Make Logical Dependencies Physical
- If one module depends upon another, that dependency should be physical, not just logical. Don’t make assumptions.

### --- Singletons / Service Locator ---
- Use dependency injection. Singletons hide dependencies.

### --- Base Classes Depending On Their Derivatives ---
- Base classes should work with any derived class. 

### --- Too Much Information ---
- Minimise interface to minimise coupling.

### --- Feature Envy ---
- The methods of a class should be interested in the variables and functions of the class they belong to, and not the variables and functions of other classes.
- Using accessors and mutators of some other object to manipulate its data, is envying the scope of the other object.

### --- Artificial Coupling ---
- Things that don’t depend upon each other should not be artificially coupled.

### --- Hidden Temporal Coupling ---
- If, for example, the order of some method calls is important, then make sure that they cannot be called in the wrong order. 

### --- Transitive Navigation ---
- Aka Law of Demeter, writing shy code.
    - Module should not have the knowledge on the inner details of the objects it manipulates.
- A module should know only its direct dependencies.