In this lab the goal was to isolate two indices from an array of size n,
only if the two indices sum to the target input.

For my implementation, I did a simple two loop search through the array without
sorting. Returning an array with two indices that sum to be equal to the target.
If the sum is not equal to the target, then we return an array with one element,
-1.

In the main function, I opted to do input validation so that we're only using
integer arrays. Once the array is populated to the user's discretion, the last
two print statements will let the user know if the target is valid.