// Last updated: 8/2/2025, 3:25:43 PM
class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        long ans=0;
        s=s.trim();
        boolean sign=false;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 && (ch=='-' || ch=='+')){
               
                if (ch=='-') sign=true;
            }
            
            else if(ch>='0' && ch<='9'){
                
                ans=ans*10+(ch-'0');
            }
            else{
                break;
            }
            if (!sign && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            

        }
        if(sign==true) return (int)(-ans);
        return (int)ans;
    }
}