// Last updated: 8/2/2025, 3:16:01 PM
class Solution {
    public int partitionString(String s) {
        int c=0;
        Set<Character> hash_set = new HashSet<>();
        for(int i=0;i<s.length();i++){
           
            if(hash_set.contains(s.charAt(i))){
                c++;
                hash_set.clear();
                
            }
            hash_set.add(s.charAt(i));
        }
        return c+1;
    }
}