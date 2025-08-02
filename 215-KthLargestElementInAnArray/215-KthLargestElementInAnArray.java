// Last updated: 8/2/2025, 3:22:22 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();

        int[] count=new int[max-min+1];
        for(int num : nums){
            count[num-min]++;
        }

        for(int i=count.length-1;i>=0;i--){
            k=k-count[i];
            if(k<=0){
                return min+i;
            }
        }
        return -1;

    }
}