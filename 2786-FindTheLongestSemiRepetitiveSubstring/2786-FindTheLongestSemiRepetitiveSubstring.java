// Last updated: 8/2/2025, 3:15:27 PM
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int i=0;
        int j=1;
        int last_dup_idx=0;
        int ans=0;
        while(j<s.length()){
            if(s.charAt(j)==s.charAt(j-1)){
                if(last_dup_idx!=0){
                    i=last_dup_idx;
                }
                last_dup_idx=j;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}