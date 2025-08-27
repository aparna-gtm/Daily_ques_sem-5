// Last updated: 8/27/2025, 12:18:16 PM
class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map=new HashMap<>();
       int min=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                min=Math.min(min,i-map.get(cards[i])+1);
            }
           
            map.put(cards[i],i);
               
           
        }
        if(min!=Integer.MAX_VALUE){
            return min;
        }
        return -1;
        
    }
}