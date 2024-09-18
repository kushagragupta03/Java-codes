/* Replace elements by its rank in the array
Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…
*/

import java.util.*;

class Solution12{

    public static void func(int arr[]){
        int dummy[]=arr.clone();
        Arrays.sort(dummy);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<dummy.length;i++){
            map.put(dummy[i],i+1);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={20,15,26,2,98,6};
        func(arr);
        sc.close();
    }

}