[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/M1rRMR3H)
# Programming Patterns - Lab 7

This template repository is the starter project for Programming Patterns Lab 7. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Given an integer array nums of length n and an integer k, return the kth **smallest subarray sum**.

A subarray is defined as a non-empty contiguous sequence of elements in an array. A subarray sum is the sum of all elements in the subarray.

Note: You should use binary search to solve this problem.

Note 2: For any sorting, use a sorting algorithm that you haven't use in the previous labs. Do NOT use Java's sorting methods.

Example 1:

Input: nums = [2,1,3], k = 4  
Output: 3  
Explanation: The subarrays of [2,1,3] are:

- [2] with sum 2
- [1] with sum 1
- [3] with sum 3
- [2,1] with sum 3
- [1,3] with sum 4
- [2,1,3] with sum 6

Ordering the sums from smallest to largest gives 1, 2, 3, 3, 4, 6. The 4th smallest is 3.

Example 2:

Input: nums = [3,3,5,5], k = 7  
Output: 10  
Explanation: The subarrays of [3,3,5,5] are:

- [3] with sum 3
- [3] with sum 3
- [5] with sum 5
- [5] with sum 5
- [3,3] with sum 6
- [3,5] with sum 8
- [5,5] with sum 10
- [3,3,5], with sum 11
- [3,5,5] with sum 13
- [3,3,5,5] with sum 16

Ordering the sums from smallest to largest gives 3, 3, 5, 5, 6, 8, 10, 11, 13, 16. The 7th smallest is 10.

**Constraints**

n == nums.length  
1 <= n <= 2 _ 104  
1 <= nums[i] <= 5 _ 104  
1 <= k <= n \* (n + 1) / 2

### Setup Command

`gradle clean`

### Run Command

`gradle test`
