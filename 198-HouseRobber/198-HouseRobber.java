// Last updated: 8/2/2025, 3:22:38 PM
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        arr[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int ele1=nums[i]+arr[i-2];
            int ele2=arr[i-1];
            arr[i]=Math.max(ele1,ele2);
        }
        return arr[arr.length-1];
        
    }
}