// Last updated: 8/2/2025, 3:20:34 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCaps(word) || allLow(word) || firstCap(word)){
            return true;
        }
        return false;
    }
    public static boolean allCaps(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                return false;
            }
        }
        return true;
    }
    public static boolean allLow(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                return false;
            }
        }
        return true;
    }
    public static boolean firstCap(String word){
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                return false;
                }
            }
            return true;
        }
        return false;
        
    }
}