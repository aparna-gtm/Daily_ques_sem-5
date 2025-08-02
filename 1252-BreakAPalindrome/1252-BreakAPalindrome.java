// Last updated: 8/2/2025, 3:18:35 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        String ans="";
        int c=0;
        int  f=0;
        for(int i=0;i<palindrome.length();i++){
            if(palindrome.charAt(i)=='a'){
                c++;
            }
            // if(palindrome.length()/2!='a'){
            //     f=1;
            // }
            

        }
        if(c==palindrome.length() || (c==palindrome.length()-1)){
            ans=palindrome.substring(0,palindrome.length()-1)+"b";
            
        }
        else{
            for(int i=0;i<palindrome.length();i++){
                if(palindrome.charAt(i)!='a'){
                    ans=palindrome.substring(0,i)+"a"+palindrome.substring(i+1);
                    break;
                }
            }
        }
        return ans;
    }
}