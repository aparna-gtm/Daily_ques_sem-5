// Last updated: 8/2/2025, 3:19:17 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] prev_smaller=previous_smaller(arr);
        int[] next_smaller=next_smaller(arr);
        long sum=0;
        int m=((int) Math.pow(10,9))+7;
        for(int i=0;i<arr.length;i++){
            long ls=i-prev_smaller[i];
            long rs=next_smaller[i]-i;
            // total subarrays
            long prod=ls*rs;

            // SUBAARYS jinka min ele arr[i] hoga
            long total=arr[i]*prod;
            sum=(sum+total)%m;
        }
        return (int)sum;
    }
    public int[] previous_smaller(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
            }
            
            
            st.push(i);
        }
        return ans;
    }
    public int[] next_smaller(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
        // yha upr = lagaya hai taki dup na bae ya isme laga do ya upr wale function m
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=arr.length;
                }
                else{
                    ans[i]=st.peek();
                }
            }
            
            
            st.push(i);
        }
        return ans;
    }
}