import java.util.*;

class Solution1{

    public static void func(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {8,105,5,7,9,2,100};
        func(arr);
        sc.close();
    }

}