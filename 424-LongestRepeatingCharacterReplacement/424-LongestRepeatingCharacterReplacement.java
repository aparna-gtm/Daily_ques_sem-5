// Last updated: 8/2/2025, 3:21:00 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int i=0;
        int j=0;
        int max_freq=0;
        int max_window=0;
        while(j<s.length()){
            // update freq array
            freq[s.charAt(j)-'A']++;

            // max_freq until now
            max_freq=Math.max(max_freq,freq[s.charAt(j)-'A']);
            
            // window size current
            int current_windowSize=j-i+1;

            //characters need to be changed in current window
            int characters_changed=current_windowSize-max_freq;

            // if characters_needed to be changed>k then shrink the window
            if(characters_changed>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            //update window size
            current_windowSize=j-i+1;
            max_window=Math.max(max_window,current_windowSize);
            j++;
        }
        return max_window;
    }
}