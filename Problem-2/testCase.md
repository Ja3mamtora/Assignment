# Test Cases for Cloth Length Distribution

## Test Case 1:
- **Input:** 
  - Applicants: 10
  - Cloth Rolls: 10
  - Tolerance: 0
  - Desired Lengths: 37, 62, 56, 69, 34, 46, 10, 86, 16, 49
  - Available Lengths: 50, 95, 47, 43, 9, 62, 83, 71, 71, 7
- **Expected Output:** 1

## Test Case 2:
- **Input:** 
  - Applicants: 10
  - Cloth Rolls: 10
  - Tolerance: 10
  - Desired Lengths: 90, 41, 20, 39, 49, 21, 35, 31, 74, 86
  - Available Lengths: 14, 24, 24, 7, 82, 85, 82, 4, 60, 95
- **Expected Output:** 6

## Test Case 3:
- **Input:** 
  - Applicants: 10
  - Cloth Rolls: 10
  - Tolerance: 1000
  - Desired Lengths: 59, 5, 65, 15, 42, 81, 58, 96, 50, 1
  - Available Lengths: 18, 59, 71, 65, 97, 83, 80, 68, 92, 67
- **Expected Output:** 10

## Test Case 4:
- **Input:** 
  - Applicants: 10
  - Cloth Rolls: 10
  - Tolerance: 1000000000
  - Desired Lengths: 25, 80, 59, 43, 67, 21, 77, 5, 8, 99
  - Available Lengths: 66, 41, 62, 24, 88, 55, 1, 53, 50, 60
- **Expected Output:** 10

... (skipping some test cases for brevity)

## Test Case 17:
- **Input:** 
  - Applicants: 199999
  - Cloth Rolls: 1
  - Tolerance: 1
  - Desired Lengths: 199996, 199997, 149999, 117797, ...
  - Available Lengths: 200000
- **Expected Output:** 1

## Test Case 18:
- **Input:** 
  - Applicants: 5
  - Cloth Rolls: 2
  - Tolerance: 2
  - Desired Lengths: 2, 2, 2, 40, 50
  - Available Lengths: 40, 50
- **Expected Output:** 2

## Test Case 19:
- **Input:** 
  - Applicants: 4
  - Cloth Rolls: 3
  - Tolerance: 5
  - Desired Lengths: 60, 45, 80, 60
  - Available Lengths: 30, 60, 75
- **Expected Output:** 2

