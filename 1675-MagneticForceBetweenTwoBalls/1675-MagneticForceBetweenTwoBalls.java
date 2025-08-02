// Last updated: 8/2/2025, 3:17:29 PM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(Possible(position,m,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean Possible(int [] position,int m,int mid){
        int balls=1;
        int pos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-pos>=mid){
                balls++;
                pos=position[i];
            }
            if(balls==m){
                return true;
            }
        }
        return false;
    }
}