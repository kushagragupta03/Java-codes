/* 2942. Find Words Containing Character
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order. */

import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                l1.add(i);
            }
        }
        return l1;
    }
}