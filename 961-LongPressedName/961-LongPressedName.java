// Last updated: 8/2/2025, 3:19:08 PM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0; // name pt
        int j = 0; // type pt
        
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
               
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // Handle long press in typed
                j++;
            } else {
               
                return false;
            }
        }
        
        
        return i == name.length();
    }
}
