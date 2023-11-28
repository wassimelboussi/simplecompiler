# Simple Java Compiler

This repository contains a simple compiler implemented in Java using CUP. The compiler consists of a lexer (`Lexer.java`) responsible for tokenizing the input code, a main class (`Main.java`) to drive the compilation process, a file reader (`ReadFiles.java`) to read input code from a file, and a token class (`Token.java`) to represent tokens.

## Getting Started

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/wassimelboussi/simplecompiler.git
    ```

2. Open the project in your preferred Java development environment (IDE).

3. Update the `pathOfFile` variable in the `Main` class with the path to your input file.

4. Run the `Main` class to compile and tokenize the input code.

## Project Structure

- **Lexer.java**: Defines a simple lexer that identifies different token types, such as identifiers, numbers, operators, whitespace, and strings. It utilizes the CUP library to generate tokens based on the input code.

- **Main.java**: The entry point of the compiler. Reads the input code from a file using the `ReadFiles` class, tokenizes the code using the `Lexer` class, and prints the value and type of each token to the console.

- **ReadFiles.java**: Provides methods to read the content of a file and convert it to a string. Used by the `Main` class to read the input code from a specified file path.

- **Token.java**: Represents a token with a value and a type. Used by the `Lexer` class to create tokens during the tokenization process.

- **text.txt**: Example input file containing a simple code snippet.

- For more information on CUP, you can visit the [CUP Examples and Documentation](https://www2.cs.tum.edu/projects/cup/examples.php).

## Example Input

The provided `text.txt` file contains a simple code snippet:

```plaintext
let x=10
if  x>=y then  if  x<=Z  then x=y * 2 else x= y/2
```

## Running the Compiler
To run the compiler, execute the Main class after updating the pathOfFile variable with the path to your input file.
