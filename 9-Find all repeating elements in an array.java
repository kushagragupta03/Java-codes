import java.util.*;

class Solution9{

    public static void func(int arr[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,2,3,4,4,5,2};
        func(arr);
        sc.close();
    }

}