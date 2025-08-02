// Last updated: 8/2/2025, 3:17:31 PM
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long total=0;
        long sum1=0;
        long sum2=0;

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                sum2+=nums2[j];
                j++;
            }
            else if(nums1[i]<nums2[j]){
                sum1+=nums1[i];
                i++;
            }
            else{
                sum1+=nums1[i];
                sum2+=nums2[j];
                total+=Math.max(sum1,sum2);
                i++;
                j++;
                sum1=0;
                sum2=0;
            }
        }

        while(i<nums1.length){
            sum1+=nums1[i];
            i++;
        }
        while(j<nums2.length){
            sum2+=nums2[j];
            j++;
        }
        total+=Math.max(sum1,sum2);
        return (int)(total%(1_000_000_000+7));
    }
}