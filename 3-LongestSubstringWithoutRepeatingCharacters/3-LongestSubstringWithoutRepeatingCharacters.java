// Last updated: 8/2/2025, 3:25:50 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[256];
        int max=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            freq[s.charAt(j)]++;
            if(freq[s.charAt(j)]>1){
                max=Math.max(max,j-i);
                while(freq[s.charAt(j)]>1){
                    freq[s.charAt(i)]--;
                    i++;
                }
                
            }
           
            max=Math.max(max,j-i+1);
             j++;

        }
        return max;
    }
}