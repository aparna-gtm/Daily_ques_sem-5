// Last updated: 8/2/2025, 3:18:28 PM
class Solution {
    class Pair {
        char ch;
        int index;

        public Pair(char ch, int idx) {
            this.ch = ch;
            this.index = idx;
        }
    }

    public String reverseParentheses(String s) {
        Stack<Pair> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(new Pair('(', sb.length()));
            } else if (ch == ')') {
              
                int idx = st.pop().index;

              
                StringBuilder rev = new StringBuilder(sb.substring(idx));
                rev.reverse();

                
                sb.delete(idx, sb.length());
                sb.append(rev);
            } else {
               
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
