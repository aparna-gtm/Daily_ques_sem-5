// Last updated: 8/2/2025, 3:19:53 PM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans=new int[t.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[st.peek()]<t[i]){
                ans[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}