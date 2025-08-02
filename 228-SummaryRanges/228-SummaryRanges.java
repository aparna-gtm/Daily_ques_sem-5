// Last updated: 8/2/2025, 3:22:11 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        int start=0;
        for(int i=0;i<nums.length;i++){
            start=nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start!=nums[i]){
                String s=start+"->"+nums[i];
                list.add(s);
            }
            else{
                String s=Integer.toString(start);
                list.add(s);
            }
        }
        return list;
    }
}