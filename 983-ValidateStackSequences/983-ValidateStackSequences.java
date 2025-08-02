// Last updated: 8/2/2025, 3:19:03 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            
            st.push(pushed[i]);

            while(!st.isEmpty() && popped[j]==st.peek()){
                j++;
                st.pop();
            }
            
            
            
        }
        return st.isEmpty();
    }
}