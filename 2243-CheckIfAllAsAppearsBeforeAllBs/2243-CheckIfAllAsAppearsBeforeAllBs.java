// Last updated: 8/2/2025, 3:16:32 PM
class Solution {
    public boolean checkString(String s) {
        int idx=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                idx=i;
                break;
            }
            
        }
        if(idx==-1){
            return true;
        }
        
        for(int i=idx;i>=0;i--){
            if(s.charAt(i)=='b'){
                return false;
            }
        }
        
        return true;
    }
}