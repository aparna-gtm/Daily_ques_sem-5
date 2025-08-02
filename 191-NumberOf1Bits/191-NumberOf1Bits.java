// Last updated: 8/2/2025, 3:22:39 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            count+=n%2;
            n/=2;
        }
        return count;
        
    }
}