// Last updated: 8/2/2025, 3:23:33 PM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int row=0; row<n; row++){

            List<Integer> list=new ArrayList<>();
            list.add(1);

            for(int col=1; col<row; col++){
                int val=ans.get(row-1).get(col) + ans.get(row-1).get(col-1);
                list.add(val);

            }
            
            if(row!=0){
                list.add(1);
            }
            ans.add(list);
        }
        return ans;
    }
    
    
    
}