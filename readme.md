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
