/* 1832. Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */


 /* Approach:
 Create a boolean array of 26 size, 
 Use the ASCII Value
 a-a= 0
 b-a= 1
 c-a= 2
 d-a= 3
 .
 .
 . and so on   now use this as an index for ur boolean array and store true there

 if any character is missing in the sentence, true will not be stored in our boolean array at the missing character's corresponding index
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        // Create an array to hold the occurrence of each letter
        boolean[] lettersPresent = new boolean[26];
        
        // Iterate through the string
        for (char c : sentence.toCharArray()) {
            // Mark the corresponding index in the array
            lettersPresent[c - 'a'] = true;
        }
        
        // Check if all letters are marked
        for (boolean isPresent : lettersPresent) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }
}