import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int first=0, last=str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                System.out.println("Not palindrome");
                break;
            }
            first++;
            last--;
        }
        
        if(first>=last){
            System.out.println("String is Palindrome");

        }
        sc.close();
    }

}
