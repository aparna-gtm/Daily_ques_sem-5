// Last updated: 8/2/2025, 3:14:49 PM
class Solution {
    public static boolean cons_sorted(int[] arr,int si,int ei){
       
        for(int i=si;i<ei;i++){
            if((arr[i]+1)!=arr[i+1] ){
                return false;
            }

        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k) {
        int[] result=new int[nums.length-(k-1)];
        int idx=0;
        int i=0;
        int j=k-1;
        while(j<nums.length){
            	if(j-i+1==k){
                    if(cons_sorted(nums,i,j)){
                        result[idx++]=nums[j];

                    }
                    else{
                        result[idx++]=-1;
                    }
                    i++;
                }
                j++;
        }
        return result;
    }
}