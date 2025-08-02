// Last updated: 8/2/2025, 3:20:54 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            freq[s.charAt(j)-'a']--;

            if(j-i+1==p.length()){
                if(ifZero(freq)){
                    list.add(i);
                }
                freq[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return list;
    }
    public static boolean ifZero(int[] freq){
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}