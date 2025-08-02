// Last updated: 8/2/2025, 3:21:15 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        helper(n,0,list);
        return list;
    }
    public static void helper(int n,int curr,List<Integer> list){
        if(curr>n){
            return;
        }
        if(curr!=0){
            list.add(curr);
        }
        

        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            helper(n,curr*10+i,list);
        }
        
        
    }
}