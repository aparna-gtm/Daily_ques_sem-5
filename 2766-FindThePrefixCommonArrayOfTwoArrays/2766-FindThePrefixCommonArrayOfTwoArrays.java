// Last updated: 8/2/2025, 3:15:29 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] freq = new int[a.length + 1];
        int[] ans = new int[a.length];

        int cur = 0;
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
            if (freq[a[i]] == 2) {
                cur++;
            }
            freq[b[i]]++;
            if (freq[b[i]] == 2) {
                cur++;
            }
            ans[i] = cur;
        }
        return ans;
    }
}