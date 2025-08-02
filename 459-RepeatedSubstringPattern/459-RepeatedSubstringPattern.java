// Last updated: 8/2/2025, 3:20:43 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=len/2;i>=1;i--){
            if(len%i==0){
                int times=len/i;
                String substr=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                while(times-->0){
                    sb.append(substr);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
// TC- root n * n
// Robin Karp ALgo