# starschema-exercise

My solutions for the following algorithm:

Given a list or array of integers, find all elements that occur only once.

- first-solution branch: using a set to count occurances
- second-solution branch: sorting the list, checking value changes
- third-solution branch: using a map, keys are the numbers from the original list, values are occurances
- fourth-solution branch: same a second solution, but using only primitives
- fifth-solution branch: preserving original order, algorithm uses primitives (only the output is collected to a list)

I also created unit tests with the following test cases (implementations may differ among the solutions because of using objects or primitives):
- input is empty list
- input contains only one value
- all elements are the same
- all elements are different
- negative integers in input list
- several duplicates, even triples in input list
- all elements are duplicates
- first index value is duplicate
- last index value is duplicate
- first index value is unique
- last index value is unique
