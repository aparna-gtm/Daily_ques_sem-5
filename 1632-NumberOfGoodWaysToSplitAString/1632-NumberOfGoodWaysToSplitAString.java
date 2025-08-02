// Last updated: 8/2/2025, 3:17:35 PM
class Solution {
    public int numSplits(String s) {
        int c=0;
        HashMap<Character,Integer> left=new HashMap<>();
        HashMap<Character,Integer> right=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            left.put(ch,left.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            right.put(ch, right.getOrDefault(ch,0)+1);
            left.put(ch, left.getOrDefault(ch, 0) - 1);
            
            if (left.get(ch) == 0) {
                left.remove(ch);
            }
            if(left.size()==right.size()){
                c++;
            }
        }
        return c;
    }
}