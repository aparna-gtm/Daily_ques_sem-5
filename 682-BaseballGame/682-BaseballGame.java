// Last updated: 8/2/2025, 3:20:06 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
              //  String n=String.valueOf((Integer.valueOf(st.peek())*2));
                st.push(String.valueOf(Integer.valueOf(st.peek())*2));
            }
            else if(operations[i].equals("+")){
                String one=(st.pop());
                String two=(st.pop());
                String n=String.valueOf(Integer.valueOf(one) + Integer.valueOf(two));
                st.push(two);
                st.push(one);
                st.push(n);


            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(operations[i]);
            }
        }
        System.out.println(st);
        int sum=0;
        while(!st.isEmpty()){
            sum+=Integer.valueOf(st.pop());
        }
        return sum;
    }
}