// Last updated: 8/2/2025, 3:21:13 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[27];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;

        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}