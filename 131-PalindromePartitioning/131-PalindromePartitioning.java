// Last updated: 8/2/2025, 3:23:21 PM
class Solution {
    public List<List<String>> partition(String s) {
       List<String> ll=new ArrayList<>();
       List<List<String>> ans=new ArrayList<>(); 
       helper(s,ll,ans);
       return ans;
    }
    public static void helper(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String sub=ques.substring(0,i);
            if(isPallindrome(sub)){
                ll.add(sub);
                helper(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPallindrome(String ques){
        int i=0;
        int j=ques.length()-1;
        while(i<j){
            if(ques.charAt(i)!=ques.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}