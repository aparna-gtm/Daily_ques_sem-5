// Last updated: 8/2/2025, 3:22:43 PM
class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                if(Long.parseLong(""+nums[i]+""+nums[j])<Long.parseLong(""+nums[j]+""+nums[i])){
                   int t=nums[i];
                   nums[i]=nums[j];
                   nums[j]=t;

                }}
            }}String a="";
            for(int i=0;i<nums.length;i++){
                a+=nums[i];
            }
            if(nums[0]==0){
                return "0";
            }
            return a;
            }
}