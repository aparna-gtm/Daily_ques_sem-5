// Last updated: 8/2/2025, 3:17:10 PM
class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            //left sum
            for(int j=0;j<i;j++){
                if(boxes.charAt(j)=='1'){
                    arr[i]=arr[i]+Math.abs(j-i);
                }
            }
    	    //right sum
            for(int j=arr.length-1;j>i;j--){
                if(boxes.charAt(j)=='1'){
                    arr[i]=arr[i]+Math.abs(j-i);
                }
            }
        }
        return arr;
    }
}