// Last updated: 8/2/2025, 3:16:37 PM
class Solution {
    public boolean canBeValid(String s, String locked) {
        
        if (s.length() % 2 != 0) {
            return false;
        }

        // Forward pass
        int open = 0;  
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                open++;
            } else {  
                if (open > 0) {
                    open--;  
                } else {
                    return false;  
                }
            }
        }

        // back pass
        int close = 0; 
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                close++;
            } else {  
                if (close > 0) {
                    close--;  
                } else {
                    return false;  
                }
            }
        }

        
        return true;
    }
}
