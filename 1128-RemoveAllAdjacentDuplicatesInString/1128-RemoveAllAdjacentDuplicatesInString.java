// Last updated: 8/2/2025, 3:18:39 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder(st.size());
        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}