// Last updated: 8/2/2025, 3:16:34 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k<spaces.length && i==spaces[k]){
                String sp=" ";
                sb.append(sp);
                k++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}