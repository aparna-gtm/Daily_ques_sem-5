// Last updated: 8/2/2025, 3:25:35 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        int i=0;
        int j=0;
        int c=0;
        
        String str1=strs[0];
        String str2=strs[strs.length-1];
        while(i<str1.length() && j<str2.length()){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(j);
            if(ch1==ch2){
                c++;
                i++;
                j++;
                
            }
            else{
                // idx=i;
                break;
            }
        }
        
        return strs[0].substring(0,c);

    }
}