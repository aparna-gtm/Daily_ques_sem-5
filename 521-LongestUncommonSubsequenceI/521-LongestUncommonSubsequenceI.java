// Last updated: 8/2/2025, 3:20:32 PM
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return a.length()>b.length()?a.length():b.length();
    }
}