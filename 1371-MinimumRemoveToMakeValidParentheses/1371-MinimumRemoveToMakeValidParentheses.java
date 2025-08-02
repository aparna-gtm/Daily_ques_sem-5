// Last updated: 8/2/2025, 3:18:16 PM
class Solution {
    public String minRemoveToMakeValid(String s) {

        int open=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')' && open>0){
                open--;
                sb.append(ch);
            }
            else if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch=='(' ){
                sb.append(ch);
                open++;
            }
        }
        for(int i=sb.length()-1;i>=0  && open>0;i--){
            if(sb.charAt(i)=='('){
                sb.deleteCharAt(i);
                open--;
            }
        }
        return sb.toString();
    }
}