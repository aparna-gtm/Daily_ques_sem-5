// Last updated: 8/2/2025, 3:20:19 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        int c=1;
        Arrays.sort(candyType);
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
                c++;
                
            }
        }
        int maxcandy=candyType.length/2;
        System.out.println(maxcandy+" "+c);
        if(maxcandy==c){
            return c;
        }
        else if(maxcandy>c){
            return c;
        }
        else{
            return maxcandy;
        }
            
        
    }
}