**Clear summary of all the Core Java topics**

**Abstraction**
- Focuses on what an object does, not how.
- Achieved via abstract classes (can have both abstract and concrete methods) and interfaces (only abstract methods by default).
- Helps in building frameworks and secure code.

**Array**
- A container to store multiple elements of the same data type.
- 1D Array: Linear storage
- 2D Array: Matrix-like
- Jagged Array: Arrays with uneven row sizes
- Use Arrays utility class for sorting, searching, etc.

**Conditional Statements**
- Directs program flow based on conditions.
- if, else if, else for basic logic
- switch for multiple-case decisions

**Constructors**
- Special method that runs when an object is created.
- Can be default, parameterized, or overloaded.
- Used to initialize variables and set up object state.

**ArrayList**
- A dynamic array from java.util.
- Grows automatically.
- Offers methods like add(), remove(), contains(), get().
- Only stores objects, not primitives.

**Encapsulation**
- Protects internal object state using private variables.
- Provides public getters/setters to access data safely.
- Helps in data hiding, modularity, and maintenance.

**Exception Handling**
- Manages runtime errors without crashing the program.
- Uses try, catch, finally, throw, and throws.
- Supports checked and unchecked exceptions.
- Can define custom exceptions.

**Inheritance**
- Enables code reuse and hierarchical relationships.
- Child class inherits properties and methods from parent.
- Supports single, multilevel, and hierarchical inheritance.
- Uses super to access parent members.

**Interface**
- A 100% abstract blueprint for a class (in older Java versions).
- A class can implement multiple interfaces.
- Promotes loose coupling and multiple inheritance.

**Looping Statements**
- Executes code repeatedly based on a condition.
- for: Known iterations
- while: Unknown iterations
- do-while: Executes at least once
- break and continue modify flow inside loops

**Methods**
- Blocks of code to perform specific tasks.
- Can return values or be void.
- Supports method overloading (same name, different parameters)

**Object Class**
- Base class for all Java classes.
- Provides methods like toString(), equals(), clone(), hashCode()
- Important for polymorphism and collections.

**Polymorphism**
- "Many forms" — same method behaves differently.
- Compile-time (Overloading): same method name, different parameters
- Runtime (Overriding): child class modifies parent class behavior

**Static Concepts**
- Shared across all objects.
- Belongs to class, not instance.
- Use for constants, utility methods, and memory efficiency.
- Static blocks initialize static data.

**StringBuilder**
- Mutable version of String.
- Efficient for repeated string changes (e.g., in loops)
- Methods: append(), insert(), delete(), reverse(), replace()

**String**
- Immutable class to represent character sequences.
- Stored in string pool for memory efficiency
- Methods: charAt(), equals(), compareTo(), substring(), split(), etc.
- Use equals() to compare content, not ==.
