// Last updated: 8/2/2025, 3:22:20 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(k,n,0,0,list,ans,1);
        return ans;
    }
    public static void helper(int k,int n,int noe,int tsum,List<Integer> list,List<List<Integer>> ans,int idx){
        if(tsum==n && noe==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=9;i++){
            if(tsum+i<=n && noe+1<=k){
                tsum+=i;
                list.add(i);
                helper(k,n,noe+1,tsum,list,ans,i+1);
                tsum-=i;
                list.remove(list.size()-1);
            }
        }
    }
}