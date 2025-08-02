// Last updated: 8/2/2025, 3:20:53 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8L * n)) / 2);
    }
}
