# Talent Show Line-Up Rearrangement

Imagine you are organizing a line-up for a talent show, and each performer must wear a costume represented by an uppercase English letter. Due to costume limitations, no two performers wearing the same costume can stand next to each other in the line-up.

Given a string `s` where each character represents a costume, rearrange the performers so that no two adjacent performers have the same costume. If it is impossible to arrange the performers in such a way, return an empty string.

## Examples:

### Example 1:
- **Input:** `s = "AAB"`
- **Output:** `"ABA"`

### Example 2:
- **Input:** `s = "AAAB"`
- **Output:** `""`

## Constraints:
- The length of `s` is between 1 and 500 inclusive.
- The string `s` only contains uppercase English letters.

## Task:

Implement a function that, given the string `s`, returns a possible valid arrangement of performers or an empty string if no such arrangement exists.
