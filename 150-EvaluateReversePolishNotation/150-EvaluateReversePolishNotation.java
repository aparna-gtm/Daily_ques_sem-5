// Last updated: 8/2/2025, 3:23:04 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int num1=0;
        int num2=0;

        for(int i=0;i<tokens.length;i++){

           
            if(tokens[i].equals("+")){
                num1=st.pop();
                num2=st.pop();
                st.push(num1+num2);
            }
            else if(tokens[i].equals("-")){
                num1=st.pop();
                num2=st.pop();
                st.push(num2-num1);
            }
            else if(tokens[i].equals("*")){
                num1=st.pop();
                num2=st.pop();
                st.push(num1*num2);

            }
            else if(tokens[i].equals("/")){
                num1=st.pop();
                num2=st.pop();
                st.push(num2/num1);
            }
            else{
                int n=Integer.parseInt(tokens[i]);
                st.push(n);
            }
            
          
        }

        return st.peek();
    }
}