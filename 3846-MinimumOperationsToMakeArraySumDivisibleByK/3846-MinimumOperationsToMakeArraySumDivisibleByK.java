// Last updated: 8/2/2025, 3:13:52 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i : nums){
            sum+=i;
            
        }
    int a=sum/k;
        int n=a*k;
        return sum-n;
    }
}