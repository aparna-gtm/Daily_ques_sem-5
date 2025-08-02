// Last updated: 8/2/2025, 3:21:17 PM
class Solution {
    public boolean canConstruct(String r, String m) {
        int[] arr1=new int[27];
        int[] arr2=new int[27];
        for(int i=0;i<r.length();i++){
            arr1[r.charAt(i)-'a']++;
        }
        for(int i=0;i<m.length();i++){
            arr2[m.charAt(i)-'a']++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<arr1[i]){
                return false;
            }
        }
        return true;
        
    }
}