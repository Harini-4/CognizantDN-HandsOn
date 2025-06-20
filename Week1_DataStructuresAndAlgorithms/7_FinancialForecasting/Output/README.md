## Recursion

Recursion is a programming technique where a method calls itself to solve a smaller instance of the same problem.  
It simplifies complex problems by breaking them down into smaller sub-problems. In financial forecasting, recursion can be used to calculate future values year by year, making the logic easier to understand and implement.

## Analysis

### Time Complexity

The recursive algorithm has a time complexity of **O(n)**, where **n** is the number of years.  
Each recursive call handles one year, leading to a linear number of calls.

### Optimization

To avoid excessive computation or stack overflow in deep recursion, the solution can be optimized by:
- Using an **iterative approach** instead of recursion.
- Applying **memoization** (for overlapping subproblems, not required in this case).
- Ensuring **tail recursion** if supported by the compiler.
