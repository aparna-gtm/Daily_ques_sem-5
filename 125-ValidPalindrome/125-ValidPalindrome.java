// Last updated: 8/2/2025, 3:23:25 PM
class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9'){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    s1+=(char)(s.charAt(i)+32);
                }
                else{
                    s1+=s.charAt(i);
                }
            }
        }
       
        int st=0;
        int e=s1.length()-1;
        while(st<=e){
            if(s1.charAt(st)!=s1.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}