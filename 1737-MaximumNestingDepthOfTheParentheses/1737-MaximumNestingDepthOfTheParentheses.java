// Last updated: 8/2/2025, 3:17:26 PM
class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
      
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
               
                c++;
                max=Math.max(max,c);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}