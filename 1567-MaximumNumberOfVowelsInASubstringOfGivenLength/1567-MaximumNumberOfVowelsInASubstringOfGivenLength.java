// Last updated: 8/2/2025, 3:17:44 PM
class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int count=0;
        int ans=Integer.MIN_VALUE;
        while(j<s.length()){
            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                count++;
            }
            if(j-i+1==k){
                
                ans=Math.max(ans,count);
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    // public static int countVowel(String s, int i, int j){
    //     int count=0;
    //     for(int k=i;k<=j;k++){
            
    //     }
    //     return count;
    // }
}