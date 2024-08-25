class Solution {
    public int maxSubArray(int[] nums) { //BRUTEFORCE
        int maxsum= Integer.MIN_VALUE ;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum=currsum + nums[k];
                }//calculated sum of a subarray

                maxsum=Math.max(currsum,maxsum);//compared the current sum with maxsum

            }
        }
        return maxsum ;
        
    }
}