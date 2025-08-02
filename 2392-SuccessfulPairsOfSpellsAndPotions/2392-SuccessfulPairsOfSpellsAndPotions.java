// Last updated: 8/2/2025, 3:16:13 PM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int currentTrack=countSuccessful(potions,success,spells[i]);
            if(currentTrack!=-1){
                spells[i]=potions.length-currentTrack;
            }
            else{
                spells[i]=0;
            }
        }
        return spells;
    }
    public static int countSuccessful(int[] potions,long success,long currentele){
        int start=0;
        int end=potions.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)potions[mid]*currentele>=success){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}