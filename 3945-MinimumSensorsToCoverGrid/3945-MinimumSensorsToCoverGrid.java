// Last updated: 8/16/2025, 9:36:55 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int row=(int)Math.ceil((double)n/(2*k+1));
        int col=(int)Math.ceil((double)m/(2*k+1));
        return row*col;
    }
}