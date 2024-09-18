/* Find all Symmetric Pairs in the array of pairs

Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.
*/

import java.util.*;

class Solution11{

    public static void func(int arr[][]){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int second=arr[i][1];
            if(map.get(second)!=null && map.get(second)==first){
                System.out.println("(" + first  + ","+ second +")");
            }
            else{
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        func(arr);
        sc.close();
    }

}