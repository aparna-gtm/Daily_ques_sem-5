// Last updated: 8/2/2025, 3:23:52 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int i=0;
        int l=0;
        int[] mid=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                mid[l++]=nums2[j];
                j++;
            }
            else if(nums1[i]<nums2[j]){
                mid[l++]=nums1[i];
                i++;
            }
            else{
                mid[l++]=nums1[i];
                j++;
            }
        }
        while(i<m){
            mid[l++]=nums1[i];
            i++;
        }
        while(j<n){
            mid[l++]=nums2[j];
            j++;
        }
        int k=0;
        for(int u=0;u<nums1.length;u++){
            nums1[u]=mid[k++];
        }
    }
}