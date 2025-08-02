// Last updated: 8/2/2025, 3:19:43 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr=new int[s.length()];
        int current=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                current=i;
            }
            arr[i]=Math.abs(i-current);
        }
       
        int[] output=new int[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
                current=i;
            }
            output[i]=Math.min(Math.abs(i-current),arr[i]);
        }
        return output;
    }
}