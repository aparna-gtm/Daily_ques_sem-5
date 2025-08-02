// Last updated: 8/2/2025, 3:20:29 PM
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        Collections.sort(dictionary);
        for(int i=0;i<dictionary.size();i++){
            String word=dictionary.get(i);
            if(issubsequence(s,word)){
                if(word.length()>ans.length()){
                    ans=word;
                }
            }
        }
        return ans;

        
    }public static boolean issubsequence(String s,String word){
        int i=0;
        int j=0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                j++;
            }
            i++;
        } return j == word.length();
    }
}