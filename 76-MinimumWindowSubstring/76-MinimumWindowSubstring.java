// Last updated: 8/2/2025, 3:24:07 PM
class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int[] freq=new int[256];
        int minWindowSize=Integer.MAX_VALUE;
        int reqCount=t.length();
        int i=0;
        int j=0;
        int start_idx=0;
        for(int ii=0;ii<t.length();ii++){
            freq[t.charAt(ii)]++;
        }
        while(j<s.length()){
            if(freq[s.charAt(j)]>0){
                reqCount--;
            }
            freq[s.charAt(j)]--;
            while(reqCount==0){
                if(minWindowSize>j-i+1){
                    minWindowSize=j-i+1;
                    start_idx=i;
                }
                 freq[s.charAt(i)]++;
                 if( freq[s.charAt(i)]>0){
                    reqCount++;
                 }
                 i++;
            }
            j++;
        }
        if(minWindowSize==Integer.MAX_VALUE){
            return "";
        }   
        return s.substring(start_idx,start_idx+minWindowSize);
    }
    
}