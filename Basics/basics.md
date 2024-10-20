# 1. Data Types
   In Java, data types define the type of data a variable can hold. Java has primitive and reference data types.

### Primitive Data Types:
* byte: 8-bit integer
* short: 16-bit integer
* int: 32-bit integer (most common for integers)
* long: 64-bit integer
* float: 32-bit floating point
* double: 64-bit floating point (more precise)
* char: 16-bit Unicode character
* boolean: true/false values

### Reference Data Types:
Classes, arrays, and interfaces.

#### Example of primitive data types:

```public class DataTypes {
public static void main(String[] args) {
int age = 25;               // Integer data type
double price = 99.99;        // Double data type
char initial = 'A';         // Char data type
boolean isTestPassed = true; // Boolean data type

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Initial: " + initial);
        System.out.println("Test Passed: " + isTestPassed);
    }
}
```
# 2. Variables

Variables store data in memory. They must be declared with a type (primitive or reference), and they can hold a value that can change during execution.

### Variable Declaration:
`Syntax: <data_type> <variable_name> = <value>;`

**Example:**

```public class Variables {
public static void main(String[] args) {
int age = 30;       // int variable
String name = "John";  // String variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

## 2.1 Java Variable Naming Conventions

In Java and many other programming languages, **variable naming conventions** help ensure readability, maintainability, and consistency in code. Following these conventions makes it easier for others (and yourself) to understand what the code does, and it reduces errors. Here are the key variable naming conventions:

## 1. General Rules
- **Descriptive Names**: Use meaningful names that describe what the variable holds or represents. For example, `age`, `price`, or `employeeCount` are better than `a`, `p`, or `ec`.
- **Avoid Reserved Words**: Don’t use Java keywords like `class`, `static`, `int`, `new`, etc., as variable names.
- **Case Sensitivity**: Java is case-sensitive, so `myVar` and `MyVar` are considered two different variables.

## 2. Camel Case Convention (lowerCamelCase)
- **Start with a lowercase letter**.
- Subsequent words should start with an uppercase letter.

### Example:
```java
int employeeSalary;
String firstName;
boolean isAvailable;
```

## 3. No Special Characters
- **Use letters, numbers, and underscores (`_`)**. Do not start variable names with a number.
- Avoid special characters like `@`, `$`, `#`, etc. (except `_`).

### Example:
```java
double itemPrice;
int _index;
```

## 4. Avoid Single-letter Variable Names
- While single-letter variable names (like `i`, `x`) are acceptable in small loops or as counters, avoid using them elsewhere. Prefer more descriptive names, even for short-lived variables.

### Good Example:
```java
int counter = 0;
```
### Loop Example (Single-letter variable okay in simple contexts):
```java
for (int i = 0; i < 10; i++) {
    // i is acceptable here
}
```

## 5. Boolean Variables
- For boolean variables, use names that imply a true/false value. It’s common to start boolean variable names with prefixes like `is`, `has`, `can`, or `should`.

### Example:
```java
boolean isEmpty;
boolean hasPermission;
boolean canProceed;
```

## 6. Constants Naming (UPPER_SNAKE_CASE)
- For constant values (usually marked with the `final` keyword), use **uppercase letters** and separate words with underscores (`_`).

### Example:
```java
final int MAX_USERS = 100;
final String DEFAULT_NAME = "Guest";
```

## 7. Avoid Hungarian Notation
- Don't prefix variable names with the type of data they hold (e.g., avoid naming variables like `strName`, `iAge`, `bFlag`). This is an outdated practice, known as **Hungarian Notation**.

## 8. Avoid Abbreviations
- Don’t use non-standard abbreviations unless they are widely accepted or obvious. For example, use `employeeNumber` instead of `empNum`.

### Good Example:
```java
String employeeAddress;
```

### Bad Example:
```java
String empAddr;   // This can be unclear and ambiguous.
```

## 9. Use Nouns for Variables
- Variables that represent data (especially objects) should be named using nouns, as they often describe a thing or entity.

### Example:
```java
String userName;
int itemCount;
```

## 10. Avoid Long Names
- While variable names should be descriptive, avoid names that are too long. Strike a balance between clarity and brevity.

### Good Example:
```java
int productQuantity;
```

### Bad Example:
```java
int productQuantityAvailableInStore;  // Too long and repetitive
```

## 11. Variable Scope Consideration
- Use meaningful names even for variables with small scopes (e.g., within loops or small methods), as this improves readability and helps avoid naming conflicts.

---

### Example of Good Variable Naming
```java
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public boolean isEligibleForPromotion() {
        return this.age > 30 && this.salary < 50000;
    }
}
```

In this example:
- Variable names like `firstName`, `lastName`, `age`, and `salary` are descriptive and follow camelCase.
- The method `isEligibleForPromotion()` uses a boolean prefix `is` for clarity.

Following these conventions will lead to cleaner and more maintainable code.
