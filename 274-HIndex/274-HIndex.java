// Last updated: 8/2/2025, 3:21:50 PM
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations.length==1){
            return citations[0]>=1?1:0;
        }
        int start=0;
        int end=citations.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(citations.length-mid==citations[mid]){
                return citations[mid];
            }
            else if(citations.length-mid>citations[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return citations.length - start;
    }
}