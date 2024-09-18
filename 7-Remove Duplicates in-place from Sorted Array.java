/* Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array. */

/* Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
*/

import java.util.*;

class Solution7{

    public static void func(int arr[]){
        int index=1,k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                k++;
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println("Unique elements= "+k);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,2,2,2,3,3};
        func(arr);
        sc.close();
    }

}