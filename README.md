# Stick-Break
CodeChef Difficulty 1123 Problem. 

# Minimum Difference in Stick Partition

Chef has a stick of length `L`. He wants to break it into `K` parts such that:

- Each part has **positive integer length**.
- The **sum of parts** is exactly `L`.
- The **goal** is to minimize the value of:  
  `∑(i=1 to K−1) |A[i+1] − A[i]|`,  
  where `A[i]` is the length of the i-th part.

## Input Format

- First line: Integer `T` — number of test cases.
- For each test case: Two space-separated integers `L` and `K`.

## Output Format

- For each test case, print a single integer — the **minimum possible value** of  
  `∑(i=1 to K−1) |A[i+1] − A[i]|`.

## Constraints

- It is guaranteed that a valid split into `K` non-zero parts is possible.
