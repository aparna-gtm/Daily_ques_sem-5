// Last updated: 8/2/2025, 3:14:54 PM
class Solution {
    public int minimumLength(String s) {
        int [] freq  = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int len = 0;
        for(int i=0; i<26; i++) {
            if(freq[i] == 0) continue;
            if(freq[i] %2==0) {
                len+=2;
            } else {
                len+=1;
            }
        }
        return len;
        
    }
}