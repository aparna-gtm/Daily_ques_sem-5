// Last updated: 8/2/2025, 3:14:23 PM
class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(!st.isEmpty() && st.peek()>nums[i]){
                continue;
            }
            st.push(nums[i]);
        }
        return st.size();
    }
}