// Last updated: 8/2/2025, 3:18:58 PM
class Solution {
    public int subarraysDivByK(int[] nums, int kk) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int rem=sum%kk;
           if(rem<0){
                rem+=kk;
           }
           if(map.containsKey(rem)){
                c+=map.get(rem);
                
           }
           map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
    }
}