// Last updated: 8/2/2025, 3:19:10 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1) return 1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
}