// Last updated: 8/2/2025, 3:21:08 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            
            st.push(ch);
        }
        
        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

     
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

  
        int index = 0;
        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }

        String result = sb.substring(index);
        return result.isEmpty() ? "0" : result;
    }
}
