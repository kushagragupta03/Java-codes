import java.util.*;

class Solution4{

    public static void func(int arr[]){
        int first=0,last=arr.length-1,temp;
        while(first<last){
            //Swap values
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,35,40,20,50,80,90,100,150,200};
        func(arr);
        sc.close();
    }

}