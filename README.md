# Java Console Calculator

A simple command-line calculator written in Java that allows users to perform basic arithmetic operations.

## Features

* Addition (+)
* Subtraction (-)
* Multiplication (*)
* Division (/)
* Continuous calculations using a loop
* User-friendly console interface
* Operator validation
* Option to run the calculator multiple times

## Requirements

* Java JDK 8 or later
* Command Prompt, PowerShell, Terminal, or an IDE such as IntelliJ IDEA, Eclipse, or VS Code

## File Structure

```text
Main.java
```

## How to Compile

Open a terminal in the folder containing `Main.java` and run:

```bash
javac Main.java
```

This creates:

```text
Main.class
```

## How to Run

After compiling, run:

```bash
java Main
```

## Example Usage

```text
Enter Your First Number: 10
Enter Your Second Number: 5
Enter An Operator (+, -, *, /): *

10.0 * 5.0 = 50.0

Do you want to run the program again? (Y/N): Y
```

## Program Logic

### User Input

The program prompts the user for:

* First number
* Second number
* Mathematical operator

### Calculations

A `switch` statement determines which operation to perform:

```java
+
-
*
/
```

### Repeat Program

After displaying the result, the user can choose:

```text
Y = Continue
N = Exit Program
```

The calculator continues running until the user chooses to exit.

## Technologies Used

* Java
* Scanner Class
* While Loops
* Switch Statements
* Variables and Data Types

## Future Improvements

* Division by zero validation
* Input validation for non-numeric values
* Scientific calculator functions
* Calculation history
* GUI version using Java Swing or JavaFX

## Author

Riley Gatto
