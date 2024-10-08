/* 1365. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2). */

/* Approach:
Brute force O(n^2)

Optimal : using HashMap
Sort the array: [1,2,2,3,8]
                 0,1,2,3,4  => These are the index of the above sorted array 
these index is actually telling the number of values smaller than our array element. 

Store this index with the corresponding array element in a hashmap and use it .  */

import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=nums.clone();
        Arrays.sort(result);
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<result.length;i++){
            hm.putIfAbsent(result[i],i);
        }
        for(int i=0;i<nums.length;i++){
            result[i]=hm.get(nums[i]);
        }
        return result;
    }
}
