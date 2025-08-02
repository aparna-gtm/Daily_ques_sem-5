// Last updated: 8/2/2025, 3:17:12 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            s.append(word1.charAt(i));
            s.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
             s.append(word1.charAt(i));
             i++;
        }
        while(j<word2.length()){
             s.append(word2.charAt(j));
             j++;
        }
        return s.toString();

    }
}