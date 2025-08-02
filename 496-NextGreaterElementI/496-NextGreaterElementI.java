// Last updated: 8/2/2025, 3:20:38 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int[] ans=new int[nums1.length];
        Arrays.fill(ans, -1);
       for(int i=0;i<nums1.length;i++){
            int idx=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx=j;
                }
            }
            if(idx==-1) continue;
           
            for(int k=idx+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    ans[i]=nums2[k];
                    break;
                }
            }
       }
        return ans;
    }
}