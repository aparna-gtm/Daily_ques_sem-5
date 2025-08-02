// Last updated: 8/2/2025, 3:20:47 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}