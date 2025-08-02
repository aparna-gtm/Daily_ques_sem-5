// Last updated: 8/2/2025, 3:14:01 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int one=Math.abs(z-x);
        int two=Math.abs(z-y);
        if(one==two) return 0;
        else if(one>two){
            return 2;
        }
        return 1;
    }
}