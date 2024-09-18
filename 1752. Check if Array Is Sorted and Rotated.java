/* 1752. Check if Array Is Sorted and Rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order, 
then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], 
where % is the modulo operation. */

/* Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2]. 
*/

/* Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
*/

/* Approach:
In a rotated sorted array like [3,4,5,1,2] , there is only 1 pivot point i.e: the point where the sorted order breaks,
if there is more than 1 pivot points, it means the array is not a sorted rotated array.  

0 pivot points means the array is just sorted and rotated by 0 places.

if(nums[i]>nums[(i+1) % n]){
    count++;
} 

this condition will find the pivot points. 
for the i iteration:
0 > 1 -> 1%5
1 > 2 -> 2%5
2 > 3 -> 3%5
3 > 4 -> 4%5
4 > 0 -> 5%5 

Note: When we do x % n, its values lie from 0 to n-1
eg: n=5 , values: 0,1,2,3,4 

*/

class Solution {
    public boolean check(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1) % n]){ 
                count++;
            }
        }
        if (count>1){
            return false;
        }
        else{
            return true;
        }
    }
}


