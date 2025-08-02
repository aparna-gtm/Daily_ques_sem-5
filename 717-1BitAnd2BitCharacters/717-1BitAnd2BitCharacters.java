// Last updated: 8/2/2025, 3:19:57 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i=0;i<bits.length;){
            if(bits[i]==1){
                if(i+1>=bits.length-1){

                    return false;
                }
                i+=2;
            }
            else{
                i++;
            }
        }
        return true;
    }
}