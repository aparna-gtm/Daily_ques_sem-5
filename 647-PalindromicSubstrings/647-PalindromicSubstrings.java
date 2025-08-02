// Last updated: 8/2/2025, 3:20:08 PM
class Solution {
    public int countSubstrings(String s) {
        int ans=count(s);
        return ans;
    }
    public static int count(String s){
        //odd
        int odd=0;
        for(int axis=0;axis<s.length();axis++){
            for(int orbit=0; axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                odd++;

            }
        }
        int even=0;
        for(double axis=0.5;axis<s.length();axis++){
            for(double orbit=0.5; axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;

            }
        }
        return odd+even;
    }
}