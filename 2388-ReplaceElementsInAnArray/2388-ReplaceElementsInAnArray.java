// Last updated: 8/2/2025, 3:16:15 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0; i<operations.length; i++) {
            int oldVal = operations[i][0];
            int newVal = operations[i][1];
            int idx = map.get(oldVal);
            nums[idx] = newVal;
            map.remove(oldVal);
            map.put(newVal, idx);
        }

        return nums;
         
    }
}