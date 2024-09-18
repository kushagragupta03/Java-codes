import java.util.*;

class Frequency{

    public static void func(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,5,10,15,10,5};
        func(arr);
        sc.close();
    }

}