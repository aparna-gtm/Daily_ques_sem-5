// Last updated: 8/2/2025, 3:16:48 PM
class Solution {
    public int[] findOriginalArray(int[] nums) {
        if (nums.length % 2 != 0) return new int[]{};
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])<=0){
                continue;
            }
            if(map.containsKey(nums[i]*2) && map.get(nums[i]*2)!=0){
                int val=map.get(nums[i]);
                
                map.put(nums[i],val-1);
                int val2=map.get(nums[i]*2);
                if(val2<=0) return new int[]{};
                list.add(nums[i]);
                
                map.put(nums[i]*2,val2-1);
            }
            else{
                return new int[]{};
            }
            

        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

}