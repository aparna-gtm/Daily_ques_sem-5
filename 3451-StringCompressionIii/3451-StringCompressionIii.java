// Last updated: 8/2/2025, 3:14:58 PM
class Solution {
    public String compressedString(String word) {
        if(word.length()==0){
            return "";
        }
        String ans="";
        int i=0;
        int j=0;
        int c=0;
        while(j<word.length()){
            if(word.charAt(j)==word.charAt(i) && c<9){
                c++;
            }
            
            else if(word.charAt(j)!=word.charAt(i) || c==9){
                ans+=c;
                ans+=word.charAt(i);
                i=j;
                c=1;
            }
            // else if(c==9){
            //     ans+=c;
            //     ans+=word.charAt(i);
            //     i=j;
            //     c=1;
            // }
            j++;
        }
        ans+=c;
        ans+=word.charAt(i);
        return ans;
    }
}