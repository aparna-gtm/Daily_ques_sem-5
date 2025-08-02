// Last updated: 8/2/2025, 3:15:15 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int [] arr = new int[nums.length];
        for(int i =0;i< nums.length;i++)
        {
           if(i%2 == 0)
           {
            arr[i] = nums[i+1];

           }
           else
           {
            arr[i] = nums[i-1];
           }
        }
        return arr;
    }
}