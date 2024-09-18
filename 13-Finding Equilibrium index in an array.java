/* Finding Equilibrium index in an array
An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right.

If equilibriumIndex == 0, the left side sum is considered to be 0. 
Similarly, if equilibriumIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.
*/

/* Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0 
*/
 
class Solution13 {
  public static int findEquilibriumIdx(int nums[]) {
    int n=nums.length;
    int totalSum = 0;
    for (int i = 0; i < n; i++) {
      totalSum += nums[i];
    }
    int leftSum = 0, rightSum = totalSum;
    for (int i = 0; i < n; i++) {
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = {2,3,-1,8,4};
    int equilibriumidx = findEquilibriumIdx(nums);
    System.out.println(equilibriumidx);
 
  }
}