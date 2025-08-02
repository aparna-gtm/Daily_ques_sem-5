// Last updated: 8/2/2025, 3:16:52 PM
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums,(a,b)->{
            if(a.length()!=b.length()){
                return Integer.compare(a.length(),b.length());
            }
            else{
                return a.compareTo(b);
            }
        });
       
        return (nums[nums.length-k]);
    }
}