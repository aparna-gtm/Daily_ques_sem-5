// Last updated: 8/2/2025, 3:25:24 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                char b=st.pop();
                char present=s.charAt(i);
                if(present ==')' && b!='('){
                    return false;
                }
                else if(present =='}' && b!='{'){
                    return false;
                }
                if(present ==']' && b!='['){
                    return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}