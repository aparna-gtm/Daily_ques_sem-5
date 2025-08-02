// Last updated: 8/2/2025, 3:22:45 PM
class Solution {
    public int trailingZeroes(int n) {
        return n/3125+n/625+n/125+n/25+n/5;
    }
}