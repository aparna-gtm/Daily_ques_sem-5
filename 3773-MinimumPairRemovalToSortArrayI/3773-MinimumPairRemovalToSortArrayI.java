// Last updated: 8/2/2025, 3:14:15 PM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0 ;i<nums.length;i++){
            list.add(nums[i]);
        }
        int res=0;
        while(!asc(list)){
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(min>sum){
                    min=sum;idx=i;
                }
            }
            
            list.set(idx,min);
            list.remove(idx+1);
            //list.remove(idx);
            res++;
        }
        return res;
    }
    public static boolean asc(List<Integer> list){
        if(list.size()==1){
            return true;
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}