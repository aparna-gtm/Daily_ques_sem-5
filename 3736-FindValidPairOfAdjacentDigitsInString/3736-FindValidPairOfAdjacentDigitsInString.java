// Last updated: 8/2/2025, 3:14:25 PM
class Solution {
    public String findValidPair(String s) {
        HashMap< Character, Integer> freqMap=new HashMap<>();
      String str="";

        for(char ch : s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                char first=s.charAt(i);
                char second=s.charAt(i+1);
                if(freqMap.get(first)==first-'0' && freqMap.get(second)==second-'0'){
                    str+=first;
                    str+=second;
                    return str;
                }
                
            }
        }
        return str;
        
    }
}