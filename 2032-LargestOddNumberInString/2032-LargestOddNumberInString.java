// Last updated: 8/2/2025, 3:16:53 PM
class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;

        for(int i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            int n=c-'0';
            if(n%2!=0){
                idx=i;
                break;
            }
        }
        if (idx==-1) return "";
        return num.substring(0,idx+1);



    }
}