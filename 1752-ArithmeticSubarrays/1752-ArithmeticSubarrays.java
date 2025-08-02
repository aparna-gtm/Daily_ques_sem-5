// Last updated: 8/2/2025, 3:17:24 PM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        boolean[] arr=new boolean[l.length];
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            List<Integer> list1=new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                list1.add(nums[j]);
            }
             System.out.println(list1+"j");
            if(list1.size()<=2){
                list.add(true);
                continue;
            }
            
            Collections.sort(list1);
            System.out.println(list1);
            int f=0;
            int diff=list1.get(1)-list1.get(0);
            for(int k=2;k<list1.size();k++){
                if(list1.get(k)-list1.get(k-1)!=diff){
                    list.add(false);
                    f=1;
                    break;
                }
            }
            if (f==0) {
                list.add(true);
            }
        }
        return list;
    }
}