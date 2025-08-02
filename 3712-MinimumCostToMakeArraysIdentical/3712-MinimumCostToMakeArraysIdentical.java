// Last updated: 8/2/2025, 3:14:31 PM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        if(Arrays.equals(arr,brr)){
            return 0;
            
        }
        long cost1=0;
        long cost2=0;
        for(int i=0;i<arr.length;i++){
            cost1+=Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            cost2+=Math.abs(arr[i]-brr[i]);
        }
        return Math.min(cost2+k,cost1);
    }
}