// Last updated: 8/2/2025, 3:16:41 PM
class Solution {
    public long countVowels(String word) {
        long totalVowels = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                totalVowels += (long) (i + 1) * (n - i);
            }
        }
        return totalVowels;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
