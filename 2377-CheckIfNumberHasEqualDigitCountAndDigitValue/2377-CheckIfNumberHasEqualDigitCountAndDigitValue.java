// Last updated: 8/2/2025, 3:16:16 PM
class Solution {
    public boolean digitCount(String num) {
        int[] freq=new int[11];
        for(int i=0;i<num.length();i++){
            freq[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            int n=i;
            int fre=freq[n];
            if(num.charAt(i)-'0'!=fre){
                return false;
            }
        }
        return true;
    }
}