import java.util.*;

class Solution10{

    public static void func(int arr[]){
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for (int key: map.keySet()){
            if(map.get(key)==1){
                System.out.print(key+",");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,-1,1,3,1};
        func(arr);
        sc.close();
    }

}