// Last updated: 8/2/2025, 3:14:56 PM
class Solution {
    public List<String> validStrings(int n) {
        String ans="";
        List<String> ll=new ArrayList<>();
        helper(n,ans,ll);
        return ll;
    }
    public static void helper(int n,String ans,List<String> list){
        if(n==0){
            list.add(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='0'){
            helper(n-1,ans+"0",list);
        }
        helper(n-1,ans+"1",list);
    }
}