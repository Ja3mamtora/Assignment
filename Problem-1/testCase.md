# Test Cases for Talent Show Line-Up Rearrangement

## Single Character
- **Input:** `s = "A"`
- **Expected Output:** `"A"`

## Two Different Characters
- **Input:** `s = "AB"`
- **Expected Output:** `"AB"`

## Two Same Characters
- **Input:** `s = "AA"`
- **Expected Output:** `""`

## Three Characters, Possible Rearrangement
- **Input:** `s = "AAB"`
- **Expected Output:** `"ABA"`

## Three Characters, Impossible Rearrangement
- **Input:** `s = "AAA"`
- **Expected Output:** `""`

## Four Characters, Possible Rearrangement
- **Input:** `s = "AABB"`
- **Expected Output:** `"ABAB"`

## Four Characters, Impossible Rearrangement
- **Input:** `s = "AAAB"`
- **Expected Output:** `""`

## Multiple Characters with Balanced Frequencies
- **Input:** `s = "AABBCC"`
- **Expected Output:** `"ABCABC"`

## Multiple Characters, One with High Frequency
- **Input:** `s = "AAAABB"`
- **Expected Output:** `""`

## Characters with Various Frequencies, Possible Rearrangement
- **Input:** `s = "AABC"`
- **Expected Output:** `"ABAC"`

## Characters with Various Frequencies, Impossible Rearrangement
- **Input:** `s = "AAABB"`
- **Expected Output:** `""`

## All Unique Characters
- **Input:** `s = "ABCDEF"`
- **Expected Output:** `"ABCDEF"`

## Large Input with High Frequency of One Character
- **Input:** `s = "A"*251 + "B"*249`
- **Expected Output:** `""`

## Balanced Large Input
- **Input:** `s = "AB".repeat(250)`
- **Expected Output:** `"ABABAB...AB"`

## Long String with Repeated Characters
- **Input:** `s = "AAAABBBBCCCC"`
- **Expected Output:** `"ABCABCABCABC"`

## Edge Case with Exactly Half Characters Repeated
- **Input:** `s = "A".repeat(250) + "B".repeat(250)`
- **Expected Output:** `"ABABAB...AB"`

## Palindrome-like Input
- **Input:** `s = "ABCCBA"`
- **Expected Output:** `"ABCABC"`

## Multiple High Frequency Characters, Possible Rearrangement
- **Input:** `s = "AABBCCDD"`
- **Expected Output:** `"ABCDABCD"`

## Multiple High Frequency Characters, Impossible Rearrangement
- **Input:** `s = "AAAABBBBCCCC"`
- **Expected Output:** `""`

## All Characters with Same Frequency
- **Input:** `s = "AABBCCDDEEFF"`
- **Expected Output:** `"ABCDEFABCDEF"`
