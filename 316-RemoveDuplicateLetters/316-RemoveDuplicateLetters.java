// Last updated: 8/2/2025, 3:21:39 PM
class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder result = new StringBuilder();
        int[] lastIdx = new int[26];
        boolean[] status = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            lastIdx[s.charAt(i) - 'a'] = i;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            
            if (status[idx]) {
                continue;
            }
            
            while (result.length() > 0 && result.charAt(result.length() - 1) > ch && lastIdx[result.charAt(result.length() - 1) - 'a'] > i) {
                status[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            
            result.append(ch);
            status[idx] = true;
        }
        
        return result.toString();
    }
}
