// Last updated: 8/2/2025, 3:14:08 PM
class Solution {
    public int longestPalindrome(String s, String t) {
        int max=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                for(int k=0;k<t.length();k++){
                    for(int l=k+1;l<=t.length();l++){
                        String sub2=t.substring(k,l);
                        String c=sub+sub2;
                        String one=sub;
                        String two=sub2;
                        if(!c.isEmpty() && isposs(c)){
                            max=Math.max(max,c.length());
                        }
                        if(!one.isEmpty() && isposs(one)){
                            max=Math.max(max,one.length());
                        }
                        if(!two.isEmpty() && isposs(two)){
                            max=Math.max(max,two.length());
                        }
                    }
                }
            }
        }
        return max;
    }
    public static boolean isposs(String s){
        int i=0;
        int j=s.length()-1;
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