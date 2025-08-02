// Last updated: 8/2/2025, 3:17:52 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int val=candies[i]+extraCandies;
            if(val>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}