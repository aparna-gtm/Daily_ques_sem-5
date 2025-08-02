// Last updated: 8/2/2025, 3:19:54 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i : asteroids){
                int f=0;
                while( !st.isEmpty() && i<0 && st.peek()>0){
                    int sum=st.peek()+i;
                    if(sum<0){
                        st.pop();
                    }
                    else if(sum>0){
                        f=1;
                        break;
                    }
                    else{
                        f=1;
                        st.pop();
                        break;
                    }
                }
                if(f==0){
                    st.push(i);
                }
            
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    
}