# Cloth Length Distribution

You have a group of n customers and m available cloth rolls. Your task is to distribute the cloth rolls in such a way that as many customers as possible will get a cloth roll that closely matches their desired length.

Each customer has a desired cloth length, and they will accept any cloth roll whose length is close enough to their desired length.

Write a function `distributeClothLength(applicants, clothRolls)` to determine how many applicants can get a cloth roll.

## Example:

### Input:
- **Applicants:** 4 customers
  - Desired cloth lengths: 60, 45, 80, 60
- **Cloth Rolls:** 3 available cloth rolls
  - Lengths: 30, 60, 75

### Output:
- **Result:** 2 applicants can get cloth rolls.

## Explanation:
Two applicants can get cloth rolls: one with a desired length of 60 can be matched with a cloth roll of length 60, and one with a desired length of 60 can also be matched with a cloth roll of length 60.

## Constraints:

- The number of applicants (n) and available cloth rolls (m) is between 1 and 200,000 inclusive.
- The tolerance value (k) is between 0 and 1,000,000,000 inclusive.
- The desired cloth lengths (a) and available cloth roll lengths (b) are between 1 and 1,000,000,000 inclusive.
