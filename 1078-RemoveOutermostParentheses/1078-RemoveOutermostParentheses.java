// Last updated: 8/2/2025, 3:18:41 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    sb.append('(');
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sb.append(')');
                }

            }
        }
        return sb.toString();
    }
}