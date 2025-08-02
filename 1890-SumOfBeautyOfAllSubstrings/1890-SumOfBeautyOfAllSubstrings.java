// Last updated: 8/2/2025, 3:17:14 PM
class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int c=count(s,i,j);
                if(c>0){
                    ans+=c;
                }
            }
        }
        return ans;
    }
    public static int count(String s,int i,int j){
        int[] freq=new int[26];
        for(int idx=i;idx<=j;idx++){
            freq[s.charAt(idx)-'a']++;
        }
        int c=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int idx=0;idx<freq.length;idx++){
            if(freq[idx]>0){
                min=Math.min(freq[idx],min);
                max=Math.max(freq[idx],max);
            }
            
            
        }
      //  System.out.println(max+" "+min);
        return max-min;
    }
}