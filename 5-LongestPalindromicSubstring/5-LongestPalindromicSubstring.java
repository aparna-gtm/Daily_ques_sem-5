// Last updated: 8/2/2025, 3:25:47 PM
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(max<j-i+1 && isPallindrome(s,i,j)){
                    max=j-i+1;
                    start=i;
                    end=j;
                }
            }
        }
        return s.substring(start,end+1);
    }
    public static boolean isPallindrome(String s,int i,int j){
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}