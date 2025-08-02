// Last updated: 8/2/2025, 3:17:56 PM
class Solution {
    public int minStartValue(int[] nums) {
        
        int[] prefix=new int[nums.length];
        int min=nums[0];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            min=Math.min(prefix[i],min);
        }
         System.out.println(Arrays.toString(prefix));
        if(min>0){
            return 1;
        }
       
        return Math.abs(min)+1;
        

    }
}