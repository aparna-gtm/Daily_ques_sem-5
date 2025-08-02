// Last updated: 8/2/2025, 3:18:36 PM
class Solution {
    public boolean parseBoolExpr(String e) {
        Stack<Character> st=new Stack<>();
       
        for(int i=0;i<e.length();i++){
            char ch=e.charAt(i);
            if(ch==')'){
                List<Character> list=new ArrayList<>();
                while(!st.isEmpty() && st.peek()!='('){
                    list.add(st.pop());
                }
                st.pop();
                char opr=st.pop();
                char res=evaluate(list,opr);
                st.push(res);
            }
            else{
                st.push(ch);
            }

        }
        if(st.peek()=='f') return false;
        return true;
    }
    public static char evaluate(List<Character> list,char opr){
        if(opr=='&'){
            for(int i=0;i<list.size();i++){
                if(list.get(i)=='f'){
                    return 'f';
                }
            }
            return 't';
        }
        else if(opr=='|'){
            for(int i=0;i<list.size();i++){
                if(list.get(i)=='t'){
                    return 't';
                }
            }
            return 'f';
        }
        // ! operator
        if(list.get(0)=='t'){
            return 'f';
        }
        return 't';
        
    }
}