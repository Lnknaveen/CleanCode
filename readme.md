# Clean Code

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
    
## Smells
### Rigity
- The software is difficult to change. A small change causes a cascade of subsequent changes.

### Fragility
- The software breaks in many places due to a single change.

### Immobility
- You cannot reuse parts of the code in other projects because of involved risks and high effort.

### Viscosity of Design
- Taking a shortcut and introducing technical debt requires less effort than doing it right.

### Viscosity of Environment
- Building, testing and other tasks take a long time. Therefore, these activities are not executed properly by everyone and technical debt is introduced.

### Needless Complexity
- The design contains elements that are currently not useful. The added complexity makes the code harder to comprehend. Therefore, extending and changing the code results in higher effort than necessary.

### Needless Repetition
- Code contains exact code duplications or design duplicates (doing the same thing in a different way)
- Making a change to a duplicated piece of code is more expensive and more error-prone because the change has to be made is several places with the risk that one place is not changed accordingly.

### Opacity
- The code is hard to understand. Therefore, any change takes additional time to first re-engineer the the code and is more likely to result in defects due to not understanding the side effects.

## Class Design
### Single Responsibility Principle (SRP)
- A class should have one, and only one, reason to change.

### Open Closed Principle (OCP)
- You should be able to extend a classes behaviour without modifying it.
 