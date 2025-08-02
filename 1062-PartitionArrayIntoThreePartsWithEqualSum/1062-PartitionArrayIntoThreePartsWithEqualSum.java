// Last updated: 8/2/2025, 3:18:43 PM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%3!=0) return false;

        int partSum=sum/3;
        int count=0;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum==partSum){
                count++;
                currSum=0;
            }
        }
        if(count>=3){
            return true;
        }
        return false;


    }
}