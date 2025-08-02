// Last updated: 8/2/2025, 3:21:29 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int ele=0;
            for(int key : map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    ele=key;
                }
            }
            ans[i]=ele;
            map.remove(ele);
        }
        return ans;
    }
}