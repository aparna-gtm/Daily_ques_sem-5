// Last updated: 8/2/2025, 3:20:01 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int zero=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                int j=i;
                for(;j<s.length();j++){
                    if(s.charAt(j)=='1' && zero>0){
                        zero--;
                        c++;
                    }
                    else if(s.charAt(j)=='0' || zero<=0){
                        zero=0;
                        break;
                    }
                }
                if(j==s.length()){
                    break;
                }
            }
        }
      //  System.out.println(c);
        zero=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                int j=i;
                for(;j>=0;j--){
                    if(s.charAt(j)=='1' && zero>0){
                        zero--;
                        c++;
                    }
                    else if(s.charAt(j)=='0' || zero<=0){
                        zero=0;
                        break;
                    }
                }
                if(j==-1){
                    break;
                }
            }
           //  System.out.println(c);
        }
        return c;
    }
}