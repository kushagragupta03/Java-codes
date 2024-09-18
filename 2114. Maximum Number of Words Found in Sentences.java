/* 
2114. Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence. */


class Solution {
    public int mostWordsFound(String[] arr) {
        int max = 0; // Initialize max to 0
        for (String sentence : arr) {
            // Split the sentence by spaces and get the length of the resulting array
            int wordCount = sentence.split(" ").length;
            // Update max if current word count is greater
            max = Math.max(max, wordCount);
        }
        return max; // Return the maximum word count found
    }
}
