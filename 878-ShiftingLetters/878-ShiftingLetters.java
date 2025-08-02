// Last updated: 8/2/2025, 3:19:35 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long totalShift = 0; 
        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26; 
            shifts[i] = (int) totalShift; 
        }

        StringBuilder result = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            
            char shiftedChar = (char) ((s.charAt(i) - 'a' + shifts[i]) % 26 + 'a');
            result.append(shiftedChar);
        }

        return result.toString();
    }
}
