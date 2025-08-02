// Last updated: 8/2/2025, 3:16:29 PM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if((i==0 || nums[i]-nums[i-1]>1 ) && (i==nums.length-1 || nums[i+1]-nums[i]>1)){
                list.add(nums[i]);
            }
        }
        return list;
    }
}