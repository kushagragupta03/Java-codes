public class Secondlargest {
    public static void main (String[] args){
        int arr[]= {10,48,25,36,16};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
                continue;
            
            if(max-arr[i]<min){
                min=max-arr[i];
            }
        }
        System.out.println(max-min);

        
    }   
}