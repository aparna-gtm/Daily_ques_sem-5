// Last updated: 8/2/2025, 3:21:10 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int i=0;
        int j=0;
        while(j<t.length() && i<s.length()){
            //System.out.println(t.charAt(j));
            
            if(s.charAt(i)==t.charAt(j)){
                i++;
                //System.out.println(s.charAt(i));
            }
            j++;
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}