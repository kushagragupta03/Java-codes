/* Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
*/

import java.util.*;

class Solution6{

    public static void func(int arr[]){
        int n=arr.length-1;
        Arrays.sort(arr);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<=n/2;i++){
            list.add(arr[i]);
        }
        for(int i=n;i>=(n/2)+1;i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={8 ,7, 1, 6, 5, 9};
        func(arr);
        sc.close();
    }

}