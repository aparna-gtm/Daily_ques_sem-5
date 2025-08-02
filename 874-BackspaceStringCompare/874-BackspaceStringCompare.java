// Last updated: 8/2/2025, 3:19:38 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(!st1.isEmpty() && s.charAt(i)=='#'){
                st1.pop();
            }
            else if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(!st2.isEmpty() && t.charAt(i)=='#'){
                st2.pop();
            }
            else if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
        }
        return st1.equals(st2);

    }
}