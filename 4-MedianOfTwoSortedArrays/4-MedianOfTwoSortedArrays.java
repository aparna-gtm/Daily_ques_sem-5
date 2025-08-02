// Last updated: 8/2/2025, 3:25:49 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int idx=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[idx]=nums2[j];
                j++;
                idx++;
            }
            else if(nums1[i]<nums2[j]){
                arr[idx]=nums1[i];
                i++;
                idx++;
            }
            else{
                arr[idx]=nums1[i];
                idx++;
                arr[idx]=nums1[i];

                i++;
                j++;
                idx++;
            }
        }
        while(i<nums1.length){
            arr[idx]=nums1[i];
            i++;
            idx++;
        }
        while(j<nums2.length){
            arr[idx]=nums2[j];
            j++;
            idx++;
        }
       
        System.out.println(Arrays.toString(arr));
        double ans=0;
        if((nums1.length+nums2.length ) %2==0){
            int one=arr.length/2-1;
            int two=(arr.length/2);
           System.out.println(arr[one]+" "+arr[two]);
            ans=(arr[one]+arr[two])/2.0;

        
        }
        else{
           ans=arr[arr.length/2];
        }
        return ans;
    }
}