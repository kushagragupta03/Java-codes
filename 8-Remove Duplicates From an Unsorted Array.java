/* Given an unsorted array of integers, print the array after removing the duplicate elements from it. 
We need to print distinct array elements according to their first occurrence.
*/

/* Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
Output : 1 2 5 7 4
Explanation : {1, 2} appear more than one time.
*/


// Approach: Create a set and put all array elements in it, a set only stores unique elements,
// Here using linkedhashset bcoz insertion order needs to be maintained

import java.util.*;

class Solution8{

    public static void func(int arr[]){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={9, 20,15, 5, 1, 7, 2, 4, 2};
        func(arr);
        sc.close();
    }

}