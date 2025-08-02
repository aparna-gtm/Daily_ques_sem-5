// Last updated: 8/2/2025, 3:18:06 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int result=0;
        int i=0;
        int j=0;
        int[] count=new int[3];
        while(j<s.length()){
            count[s.charAt(j)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                result+=s.length()-j;
                count[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return result;
    }
}