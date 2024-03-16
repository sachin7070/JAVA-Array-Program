# Java Arrays Interview Questions and Programs

This repository contains a collection of Java array interview questions along with their solutions in the form of Java programs.

## Introduction to Arrays in Java

Arrays are fundamental data structures in Java, allowing you to store multiple values of the same type in a single variable. An array in Java is a container object that holds a fixed number of values of a single data type. Arrays can be of any data type, including primitive types such as int, char, double, etc., or reference types such as objects.

Arrays in Java are zero-indexed, meaning the index of the first element is 0, the index of the second element is 1, and so on. Arrays have a fixed size, which is determined at the time of their creation and cannot be changed dynamically. However, Java provides dynamic arrays through ArrayList, which can resize itself dynamically.

## Syntax of Arrays in Java

### Declaration:
```java
dataType[] arrayName;
```
Initialization:
```java
dataType[] arrayName = new dataType[arraySize];
```
Example:
```java
// Declaration
int[] numbers;

// Initialization
numbers = new int[5];

// Array Literal Initialization
int[] numbers = {1, 2, 3, 4, 5};
```

Accessing Elements:
```java
arrayName[index];
```
Example:
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

Array Length:
```java
arrayName.length;
```
Example:
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers.length); // Output: 5
```
### Multidimensional Arrays:

Definition: A multidimensional array in Java is an array of arrays. It allows you to store elements in multiple dimensions, such as rows and columns.

Declaration and Initialization:

```java
// Declaration
int[][] matrix;

// Initialization
matrix = new int[3][4]; // Creates a 2D array with 3 rows and 4 columns
```
Accessing Elements:

Elements of a multidimensional array are accessed using multiple indices. For a 2D array, you need two indices: one for the row and one for the column.
```java
matrix[0][0] = 1; // Assigns 1 to the element at the first row and first column
int y = matrix[1][2]; // Retrieves the value of the element at the second row and third column

```
Initialization with Values:

You can initialize a multidimensional array with specific values at the time of declaration.

```java
int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; // Initializes a 2D array with specific values
```
Ragged Arrays:

In Java, multidimensional arrays can have different lengths for each row. Such arrays are called ragged arrays.
```java
int[][] raggedArray = { {1, 2}, {3, 4, 5}, {6} }; // Initializes a ragged 2D array
```

## Questions and Programs

1.	WAP to create an array of size n
2. 	WAP to calculate sum of all the array elements
3.	WAP to product of all the array elements
4. 	WAP to calculate the difference of sum of even elements and odd elements 
5.	WAP to display all numbers between two given range
6. 	WAP to reverse an array
7.	WAP to find largest element from an array
8. 	WAP to find smallest element from an array
9.    WAP to find the difference of maximum and minimum element of an array
10.	WAP to find the second largest element in an array
11.	WAP to find the second smallest element in an array
12.	WAP to sort an array in ascending order
13.	WAP to sort an array in descending order
14.	WAP to Sort first half in ascending order and second half in descending
15.	WAP to Finding the frequency of elements in an array
16.	WAP to Sorting elements of an array by frequency 
17.	WAP to Finding the Longest Palindrome in an Array
18.	WAP to Counting Distinct Elements in an Array
19.	WAP to Finding  Repeating elements in an Array
20.	WAP to Finding Non Repeating elements in an Array
21.	WAP to Removing Duplicate elements from an array
22.	WAP to Finding Minimum scalar product of two vectors
23.	WAP to Finding Maximum scalar product of two vectors in an array
24.	WAP to Counting the number of even and odd elements in an array
25.	WAP to Find all Symmetric pairs in an array
26.	WAP to Find maximum product sub-array in a given array
27.	WAP to Finding Arrays are disjoint or not
28.	WAP to Determine Array is a subset of another array or not
29.	WAP to Determine can all numbers of an array be made equal
30.	WAP to Finding Minimum sum of absolute difference of given array
31.	WAP to Sort an array according to the order defined by another array
32.	WAP to Replace each element of the array by its rank in the array
33.	WAP to Finding equilibrium index of an array
34.	WAP to left rotate an array by k position
35.	WAP to right rotate an array by k position
36.	WAP to find Balanced Parenthesis 
37.	WAP to sort an array which consists of only 0, 1 and 2.
38.	WAP to Find the “Kth” max and min element of an array
39.	WAP to Move all the negative elements to one side of the array
40.	WAP to Find the Union and Intersection of the two sorted arrays.
41.	WAP to Find Largest sum contiguous Subarray
42.	WAP to Minimize the maximum difference between heights
43.	WAP to Minimum no. of Jumps to reach the end of an array
44.	WAP to Find duplicate in an array of N+1 Integers
45.	WAP to Merge 2 sorted arrays without using extra space
46.	WAP for Kadane’s Algorithm
47.	WAP for Merge Intervals
48.	WAP for Count Inversion
49.	WAP for Best time to buy and Sell stock
50.	WAP to Find all pairs on integer array whose sum is equal to given number
51.	WAP to Find if there is any subarray with sum equal to 0
52.	WAP to Find factorial of a Large Number
53.	WAP to Find common elements In 3 sorted arrays
54.	WAP to Rearrange the array in alternating positive and negative items 
55.	WAP to Find all elements that appear more than ” n/k ” times
56.	WAP to Maximize profit by buying and selling a share at-most twice
57.	WAP to find Next Permutation
58.	WAP to Find longest consecutive subsequence
59.	WAP for Trapping Rain water problem
60.	WAP for Chocolate Distribution problem
61.	WAP to find Smallest Subarray with sum greater than a given value
62.	WAP for Three way partitioning of an array around a given value
63.	WAP that require Minimum no. of operations to make an array palindrome
64.	WAP to find Median of 2 sorted arrays of equal size
65.	WAP to find Median of 2 sorted arrays of different size
66.	WAP to Find a peak element which is not smaller than its neighbours
67.	WAP to Find the missing integer
68.	WAP to Count Pairs with the given sum
69.	WAP to Find a triplet that sums to a given value
70.	WAP for Coin Change Problem
