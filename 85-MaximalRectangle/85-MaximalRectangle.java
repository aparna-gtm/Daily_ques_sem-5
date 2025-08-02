// Last updated: 8/2/2025, 3:23:54 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] height=new int[n];
        
        for(int i=0;i<n;i++){
            height[i]=matrix[0][i]-'0';
        }
        int maxArea=area(height);

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    height[j]=0;
                }
                else{
                    height[j]=height[j]+1;
                }
            }
            maxArea=Math.max(maxArea,area(height));
        }
        return maxArea;
    }
    public static int area(int[] height){
        int maxAr=Integer.MIN_VALUE;
        int[] arr=findWidth(height);
        for(int i=0;i<height.length;i++){
            int h=height[i];
            int width=arr[i];
            int area_curr=h*width;
            maxAr=Math.max(maxAr,area_curr);
        }
        return maxAr;
    }
    public static int[] findWidth(int[] height){
        int[] NS=next_smaller(height);
        int[] PS=previous_smaller(height);
        int[] ans=new int[height.length];
        for(int i=0;i<height.length;i++){
            ans[i]=NS[i]-PS[i]-1;
        }
        return ans;


    }
    public static int[] next_smaller(int[] height){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=height.length;
            }
           else{
                while(!st.isEmpty() && height[st.peek()]>=height[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=height.length;
                }
                else{
                    ans[i]=st.peek();
                }
           }
           st.push(i);
        }
        return ans;
    }
    public static int[] previous_smaller(int[] height){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[height.length];
        for(int i=0;i<height.length;i++){
            if(st.isEmpty()){
                ans[i]=-1;
            }
           else{
                while(!st.isEmpty() && height[st.peek()]>=height[i]){
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
    
}