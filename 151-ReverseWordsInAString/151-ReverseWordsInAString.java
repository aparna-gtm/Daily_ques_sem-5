// Last updated: 8/2/2025, 3:23:02 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        return sb.toString().trim();
    }
}