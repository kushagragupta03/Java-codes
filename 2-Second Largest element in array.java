/*
Approach: Find the max and the min element in the first loop.
Traverse the array again, skipping the iteration when max or min element appears.
and now find the largest and smallest among the remaining elements, that will be my second largest and smallest.
*/

import java.util.*;

class Solution2{

    public static void func(int arr[]){
        //Find max and min
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }

        int secondmax=Integer.MIN_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            //While traversing ignore max and min elements
            if(arr[i]==max || arr[i]==min){
                continue;
            }
            secondmax=Math.max(secondmax, arr[i]);
            secondmin=Math.min(secondmin, arr[i]);


        }
        System.out.println(secondmax);
        System.out.println(secondmin);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {45,62,98,54,30,21,18};
        func(arr);
        sc.close();
    }

}