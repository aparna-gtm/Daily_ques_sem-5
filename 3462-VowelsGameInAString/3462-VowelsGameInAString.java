// Last updated: 8/2/2025, 3:14:53 PM
class Solution {
    public boolean doesAliceWin(String s) {
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
        }
        return false;
    }
}