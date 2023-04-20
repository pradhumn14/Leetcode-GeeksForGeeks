class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String word = new String("");
        
        
        int i = 0;
        int j = 0;
        
        while (i < word1.length() && j < word2.length()) {
            word += word1.charAt(i);
            word += word2.charAt(j);
            i++;
            j++;
        }
        
        if (i < word1.length() && j == word2.length()) {
            while (i < word1.length()) {
                word += word1.charAt(i);
                i++;
            }
        }
        if (i == word1.length() && j < word2.length()) {
            while (j < word2.length()) {
                word += word2.charAt(j);
                j++;
            }
        }
        
        
        return word;
        
    }
}