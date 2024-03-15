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

dataType[] arrayName = new dataType[arraySize];
Example:

// Declaration
int[] numbers;

// Initialization
numbers = new int[5];

// Array Literal Initialization
int[] numbers = {1, 2, 3, 4, 5};
Accessing Elements:

arrayName[index];
Example:

int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
Array Length:

arrayName.length;
Example:

int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers.length); // Output: 5

## Questions and Programs

Below is a list of questions along with the corresponding Java programs provided in this repository:
1. **WAP to create an array of size n**
   - Program: `CreateArray.java`

2. **WAP to calculate sum of all the array elements**
   - Program: `SumOfElements.java`

3. **WAP to product of all the array elements**
   - Program: `ProductOfElements.java`

4. **WAP to calculate the difference of sum of even elements and odd elements**
   - Program: `DifferenceOfEvenAndOdd.java`

5. **WAP to display all numbers between two given range**
   - Program: `DisplayNumbersInRange.java`

6. **WAP to reverse an array**
   - Program: `ReverseArray.java`

7. **WAP to find largest element from an array**
   - Program: `FindLargestElement.java`

8. **WAP to find smallest element from an array**
   - Program: `FindSmallestElement.java`

9. **WAP to find the difference of maximum and minimum element of an array**
   - Program: `DifferenceOfMaxAndMin.java`

10. **WAP to find the second largest element in an array**
    - Program: `FindSecondLargest.java`

11. **WAP to find the second smallest element in an array**
    - Program: `FindSecondSmallest.java`

12. **WAP to sort an array in ascending order**
    - Program: `SortAscending.java`

13. **WAP to sort an array in descending order**
    - Program: `SortDescending.java`

14. **WAP to Sort first half in ascending order and second half in descending**
    - Program: `SortHalfAscendingHalfDescending.java`

15. **WAP to Finding the frequency of elements in an array**
    - Program: `FrequencyOfElements.java`

16. **WAP to Sorting elements of an array by frequency**
    - Program: `SortByFrequency.java`

17. **WAP to Finding the Longest Palindrome in an Array**
    - Program: `LongestPalindrome.java`

18. **WAP to Counting Distinct Elements in an Array**
    - Program: `CountDistinctElements.java`

19. **WAP to Finding Repeating elements in an Array**
    - Program: `FindRepeatingElements.java`

20. **WAP to Finding Non Repeating elements in an Array**
    - Program: `FindNonRepeatingElements.java`

21. **WAP to Removing Duplicate elements from an array**
    - Program: `RemoveDuplicates.java`

22. **WAP to Finding Minimum scalar product of two vectors**
    - Program: `MinimumScalarProduct.java`

23. **WAP to Finding Maximum scalar product of two vectors in an array**
    - Program: `MaximumScalarProduct.java`

24. **WAP to Counting the number of even and odd elements in an array**
    - Program: `CountEvenOddElements.java`

25. **WAP to Find all Symmetric pairs in an array**
    - Program: `SymmetricPairs.java`

26. **WAP to Find maximum product sub-array in a given array**
    - Program: `MaximumProductSubarray.java`

27. **WAP to Finding Arrays are disjoint or not**
    - Program: `ArraysDisjoint.java`

28. **WAP to Determine Array is a subset of another array or not**
    - Program: `ArraySubset.java`

29. **WAP to Determine can all numbers of an array be made equal**
    - Program: `EqualNumbers.java`

30. **WAP to Finding Minimum sum of absolute difference of given array**
    - Program: `MinimumSumAbsoluteDifference.java`

31. **WAP to Sort an array according to the order defined by another array**
    - Program: `SortByDefinedOrder.java`

32. **WAP to Replace each element of the array by its rank in the array**
    - Program: `ReplaceByRank.java`

33. **WAP to Finding equilibrium index of an array**
    - Program: `EquilibriumIndex.java`

34. **WAP to left rotate an array by k position**
    - Program: `LeftRotate.java`

35. **WAP to right rotate an array by k position**
    - Program: `RightRotate.java`

36. **WAP to find Balanced Parenthesis**
    - Program: `BalancedParenthesis.java`

37. **WAP to sort an array which consists of only 0, 1 and 2**
    - Program: `Sort012.java`

38. **WAP to Find the “Kth” max and min element of an array**
    - Program: `KthMaxMin.java`

39. **WAP to Move all the negative elements to one side of the array**
    - Program: `MoveNegative.java`

40. **WAP to Find the Union and Intersection of the two sorted arrays**
    - Program: `UnionIntersection.java`

41. **WAP to Find Largest sum contiguous Subarray**
    - Program: `LargestContiguousSubarray.java`

42. **WAP to Minimize the maximum difference between heights**
    - Program: `MinimizeMaxDifference.java`

43. **WAP to Minimum no. of Jumps to reach the end of an array**
    - Program: `MinJumpsToEnd.java`

44. **WAP to Find duplicate in an array of N+1 Integers**
    - Program: `FindDuplicateInArray.java`

45. **WAP to Merge 2 sorted arrays without using extra space**
    - Program: `MergeSortedArrays.java`

46. **WAP for Kadane’s Algorithm**
    - Program: `KadanesAlgorithm.java`

47. **WAP for Merge Intervals**
    - Program: `MergeIntervals.java`

48. **WAP for Count Inversion**
    - Program: `CountInversions.java`

49. **WAP for Best time to buy and Sell stock**
    - Program: `BuySellStock.java`

50. **WAP to Find all pairs on integer array whose sum is equal to given number**
    - Program: `PairsWithSum.java`

51. **WAP to Find if there is any subarray with sum equal to 0**
    - Program: `SubarrayWithSumZero.java`

52. **WAP to Find factorial of a Large Number**
    - Program: `FactorialOfLargeNumber.java`

53. **WAP to Find common elements In 3 sorted arrays**
    - Program: `CommonElementsInArrays.java`

54. **WAP to Rearrange the array in alternating positive and negative items**
    - Program: `RearrangePositiveNegative.java`
55.**WAP to Find all elements that appear more than ” n/k ” times**
    - Program: 

56. **WAP to Find all elements that appear more than ” n/k ” times**
    - Program: `ElementsMoreThanNKTimes.java`

57. **WAP to Maximize profit by buying and selling a share at-most twice**
    - Program: `MaximizeProfit.java`

58. **WAP to find Next Permutation**
    - Program: `NextPermutation.java`

59. **WAP to Find longest consecutive subsequence**
    - Program: `LongestConsecutiveSubsequence.java`

60. **WAP for Trapping Rain water problem**
    - Program: `TrappingRainWater.java`

61. **WAP for Chocolate Distribution problem**
    - Program: `ChocolateDistribution.java`

62. **WAP to find Smallest Subarray with sum greater than a given value**
    - Program: `SmallestSubarraySum.java`

63. **WAP for Three way partitioning of an array around a given value**
    - Program: `ThreeWayPartition.java`

64. **WAP that requires Minimum no. of operations to make an array palindrome**
    - Program: `MinOperationsToPalindrome.java`

65. **WAP to find Median of 2 sorted arrays of equal size**
    - Program: `MedianOfSortedArraysEqual.java`

66. **WAP to find Median of 2 sorted arrays of different size**
    - Program: `MedianOfSortedArraysDifferent.java`

67. **WAP to Find a peak element which is not smaller than its neighbours**
    - Program: `PeakElement.java`

68. **WAP to Find the missing integer**
    - Program: `MissingInteger.java`

69. **WAP to Count Pairs with the given sum**
    - Program: `CountPairsWithSum.java`

70. **WAP to Find a triplet that sums to a given value**
    - Program: `TripletWithSum.java`

71. **WAP for Coin Change Problem**
    - Program: `CoinChange.java`
