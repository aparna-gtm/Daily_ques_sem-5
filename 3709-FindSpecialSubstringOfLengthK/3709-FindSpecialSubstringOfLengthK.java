// Last updated: 8/2/2025, 3:14:33 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int count=1;
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                if(count==k){
                    return true;
                }
                else{
                    count=1;
                }
            }
            i++;
        }
        if(count==k){
            return true;
        }
        return false;
    }
}