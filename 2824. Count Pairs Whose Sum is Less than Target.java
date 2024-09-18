/* 2824. Count Pairs Whose Sum is Less than Target
Given a 0-indexed integer array nums of length n and an integer target, 
return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
*/

//Brute force

import java.util.*;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Integer arr[]=nums.toArray(new Integer [nums.size()]);
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target){
                    count++;
                }
            }
        }
        return count;
    }
}


/* Approach
The Two-Pointers Approach is a common technique to solve problems involving arrays or sequences. 
In this case, you can use two pointers, often referred to as the "left" and "right" pointers, to traverse the array and find pairs that satisfy the given condition.

Here's a high-level overview of the approach:

1.) Sort the array in ascending order. Sorting helps in efficiently exploring pairs with sums less than the target value.

2.) Initialize two pointers, left and right, pointing to the first and last elements of the sorted array, respectively.

3.) Initialize a variable count to keep track of the count of valid pairs.
While the left pointer is less than the right pointer:
If the sum of the elements at left and right is less than the target value, it means all pairs with the current left element will also satisfy the condition.
So, increment the count by right - left and move the left pointer to the right.
If the sum is greater than or equal to the target, move the right pointer to the left.

4.) Continue this process until the left pointer crosses the right pointer.

Complexity
Time complexity: O(nlogn)
Sorting the array takes O(n log n) time, where n is the number of elements in the array. 
The two-pointer traversal takes linear time, O(n), as each element is visited once.
Overall, the time complexity is dominated by the sorting step, making it O(n log n). */

/* Example:
Array= [-7,-6,-2,-1,2,3,5] , Target = -2 
*/

class Solution1 {
    public int countPairs(List<Integer> nums, int target) {
        Integer arr[]=nums.toArray(new Integer [nums.size()]);
        Arrays.sort(arr);
        int count=0;
        int left=0,right=arr.length-1;
        while (left<right){
            if(arr[left]+arr[right]<target){
                count+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}

