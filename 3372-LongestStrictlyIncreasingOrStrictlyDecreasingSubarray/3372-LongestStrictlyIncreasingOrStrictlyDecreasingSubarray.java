// Last updated: 8/2/2025, 3:15:07 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
   
        int max1=0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                 max1=Math.max(max1,i-j+1);
  
            }
            else{
               
                j=i;
       
            }
        }
      
        j=0;
        int max2=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                max2=Math.max(i-j+1,max2);
                
            }
            else{
                
                j=i;
            
            }
        }
        
        if (Math.max(max1,max2)==0){
            return 1;
        }
        return Math.max(max1,max2);
            
    }
}