/* 1636. Sort Array by Increasing Frequency
Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.
*/

/* Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1] */

import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        } //Counting the frequency

        ArrayList<Integer> list= new ArrayList<>(map.keySet()); // keys are stored into AL by this way directly
        
        //CUSTOM SORTING using Lambda expression
        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            else{
                return map.get(a)-map.get(b);
            }
        });

        int index=0;
        for(int num:list){
            for(int i=0;i<map.get(num);i++){
                nums[index]=num;
                index++;
            }
        }
        return nums;

    }
}