// Last updated: 8/2/2025, 3:25:12 PM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        int[] arr=new int[s.length()];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                list.add(i);
            }
            else{
                if(st.isEmpty()) continue;
                if(st.peek()=='('){
                    arr[i]=1;
                    arr[list.get(list.size()-1)]=1;
                    list.remove(list.size()-1);
                    st.pop();
                }
            }
        }
       // System.out.println(Arrays.toString(arr));
        int i=0;
        int j=0;
        int max=0;
        while(j<arr.length){
            
           if(arr[j]==1){
                i=j;
                while(j<arr.length && arr[j]==1){
                    max=Math.max(max,j-i+1);
                    j++;

                }
                i=j;
           }
           j++;
        }
        return max;
    }
}