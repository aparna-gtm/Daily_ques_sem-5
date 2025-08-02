// Last updated: 8/2/2025, 3:19:44 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int idx=-1;
        for(int i=0;i<goal.length();i++){
            if(goal.charAt(i)==s.charAt(0)){
                idx=i;
                String s1=goal.substring(idx,goal.length())+goal.substring(0,idx);
                if(s1.equals(s)){
                    return true;
                }
            }
        }
        return false;

    }
}