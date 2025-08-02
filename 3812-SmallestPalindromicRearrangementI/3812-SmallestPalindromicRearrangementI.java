// Last updated: 8/2/2025, 3:14:03 PM
class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder first=new StringBuilder();
        StringBuilder two=new StringBuilder();
        char ch='.';
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                ch=(char)('a'+i);
            }
            for(int j=0;j<freq[i]/2;j++){
                first.append((char)('a'+i)+"");
                two.insert(0,(char)('a'+i)+"");
            }
        }
        if(ch!='.'){
            first.append(ch+"");
           
        }
        return first.append(two.toString()).toString();
    }
}