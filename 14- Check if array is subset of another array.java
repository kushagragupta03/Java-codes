/* Check if array is subset of another array.

Write a program to find whether an array is a subset of another array or not.

Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. 
An array is called a subset of another if all of its elements are present in the other array.

Note: Array elements are assumed to be unique.

Example 1:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]
*/

import java.util.*;

class Solution14{

    public static void func(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for (Integer num : arr2) {
            set.add(num);
        }
        int count=0;
        for (Integer num : arr1) {
            if(set.contains(num)){
                count++;
            }
        }

        if(count==arr1.length){
            System.out.println("arr1 is the subset of arr2");
        }
        else{
            System.out.println("arr1 is not the subset of arr2");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,3,4,5,2,10,42};
        int arr2[]={4,3,1,7,5,15,10,2,42};
        func(arr1,arr2);
        sc.close();
    }

}