import java.util.*;

class Solution3{

    public static void func(int arr[]){
        // Find first largest element
        int first = Integer.MIN_VALUE; 
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        // Find second largest element
        int second = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        // Find third largest element
        int third = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        System.out.println(third);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {20,40,80,100,150,200,250};
        func(arr);
        sc.close();
    }

}