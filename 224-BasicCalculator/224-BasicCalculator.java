// Last updated: 8/2/2025, 3:22:15 PM
class Solution {
    public int calculate(String s) {
        int number=0;
        int result=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int n=s.charAt(i)-'0';
                number=number*10+n;
            }
            else if(s.charAt(i)=='+'){
                // no ban chuka hai
                result=result+(number*sign);
                number=0;
                sign=1;
            }
            else if(s.charAt(i)=='-'){
                result=result+(number*sign);
                number=0;
                sign=-1;
            }
            else if(s.charAt(i)=='('){
                st.push(result);
                st.push(sign);
                result=0;
                number=0;
                sign=1;
            }
            else if(s.charAt(i)==')'){
                // bracket k andar ka result
                result+=(number*sign);
                number=0;
                int sign_st=st.pop();
                int last_result=st.pop();
                result*=sign_st;
                result+=last_result;


            }
        }
        result+=(number*sign);
        return result;
    }
}