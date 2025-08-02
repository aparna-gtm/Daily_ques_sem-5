// Last updated: 8/2/2025, 3:25:13 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        int q=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                p=i-1;
                q=i;
                break;
            }
        }
        if(p==-1){
            Arrays.sort(nums);
           return;
            
        }
        for(int i=nums.length-1;i>p;i--){
            if(nums[i]>nums[p]){
                int temp=nums[p];
                nums[p]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        int k=nums.length-1;
        while(q<k){
            int temp=nums[k];
            nums[k]=nums[q];
            nums[q]=temp;
            k--;
            q++;
        }
       
    }
}