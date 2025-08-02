// Last updated: 8/2/2025, 3:20:58 PM
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        
        if(s.length()==0) {
            return 0;
        }
        String[] arr=s.split("\\s+");
        return arr.length;
    }
}