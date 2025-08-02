// Last updated: 8/2/2025, 3:14:47 PM
class Solution {
    public int possibleStringCount(String word) {
        int c=word.length();
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)!=word.charAt(i)) c--;
        }
        return c;
    }
}