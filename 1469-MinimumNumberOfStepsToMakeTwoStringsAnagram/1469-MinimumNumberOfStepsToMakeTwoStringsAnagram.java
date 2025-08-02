// Last updated: 8/2/2025, 3:18:04 PM
class Solution {
    public int minSteps(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]>freq2[i]){
                count+=freq1[i]-freq2[i];
            }
        }
        return count;
    }
}