// Last updated: 8/2/2025, 3:25:40 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int sum=0;
        int water=0;
        while(i<j){
            water= Math.min(height[i],height[j])*(j-i);
            sum=Math.max(sum,water);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return sum;
    }
}