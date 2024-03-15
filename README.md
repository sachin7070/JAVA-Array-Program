# Java Arrays Interview Questions and Programs

This repository contains a collection of Java array interview questions along with their solutions in the form of Java programs.

## Introduction to Arrays in Java

Arrays are fundamental data structures in Java, allowing you to store multiple values of the same type in a single variable. An array in Java is a container object that holds a fixed number of values of a single data type. Arrays can be of any data type, including primitive types such as int, char, double, etc., or reference types such as objects.

Arrays in Java are zero-indexed, meaning the index of the first element is 0, the index of the second element is 1, and so on. Arrays have a fixed size, which is determined at the time of their creation and cannot be changed dynamically. However, Java provides dynamic arrays through ArrayList, which can resize itself dynamically.

## Syntax of Arrays in Java

### Declaration:
```java

dataType[] arrayName;
Initialization:
java
Copy code
dataType[] arrayName = new dataType[arraySize];
Example:
jav
// Declaration
int[] numbers;

// Initialization
numbers = new int[5];

// Array Literal Initialization
int[] numbers = {1, 2, 3, 4, 5};
Accessing Elements:
java
Copy code
arrayName[index];
Example:
java
Copy code
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
Array Length:
java
Copy code
arrayName.length;
Example:
java
Copy code
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers.length); // Output: 5
