// Last updated: 8/2/2025, 3:21:28 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len=nums1.length;
        if(nums1.length>nums2.length){
            len=nums2.length;
        }
        int[] ans=new int[len];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]>nums2[j]){
                j++;

            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                if(k==0){
                    ans[k++]=nums1[i];
                }
                if(ans.length>1 && nums1[i]!=ans[k-1]){
                    ans[k++]=nums1[i];
                }
                
                
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}