import java.util.*;
class Solution {
  public static String solve(String str1, String str2) {
    HashSet<Character> set=new HashSet<>();
    StringBuilder result= new StringBuilder();
    
    //put characters of string 2 in hashset
    for(char ch: str2.toCharArray()){
      set.add(ch);
    }
    
    //traverse string1, if string1's character also belongs in string 2 (we know this by set's contain method), we will not add the character in result string
    for(char c: str1.toCharArray()){
      if(!set.contains(c)){
        result.append(c);
      }
    }

    return result.toString(); //convert stringbuider to string

  }

  public static void main(String args[]) {
    String str1 = "abcdef";
    String str2 = "aaaabbb";

    System.out.println("Final string 1:");
    System.out.println(solve(str1, str2));
  }
}
