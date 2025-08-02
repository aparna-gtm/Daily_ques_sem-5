// Last updated: 8/2/2025, 3:25:29 PM
class Solution {
    static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        
        List<String> list=new ArrayList<>();
        if(digits.length()==0) return list;
        
        helper(digits,"",list);
        return list;
    }
    public static void helper(String ques,String ans,List<String> list){
        if(ques.length()==0){
            list.add(ans);
            return;
        }
        int num=ques.charAt(0)-'0';
        String str=map[num];
        for(int i=0;i<str.length();i++){
            helper(ques.substring(1),ans+str.charAt(i),list);
        }
    }
   
}