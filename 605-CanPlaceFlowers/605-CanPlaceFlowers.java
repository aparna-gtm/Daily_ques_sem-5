// Last updated: 8/2/2025, 3:20:18 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0) return true;
        int c=0;
        for(int i=0; i<flowerbed.length; i++) {
            if( (i==0 || flowerbed[i-1]!=1) && (i==flowerbed.length-1 || flowerbed[i+1]!=1) && flowerbed[i] == 0 ) {
                c++;
                i++;
                if(c>=n) return true;
            }
        }
        if(c>=n) return true;
        return false;    
    }
}