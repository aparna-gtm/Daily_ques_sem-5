// Last updated: 8/2/2025, 3:14:18 PM
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;
        for(Integer value : freq.values()){
            if(value%2==0){
                even=Math.min(value,even);
            }
            else{
                odd=Math.max(value,odd);
            }
        }
        // if(odd<even){
        //     even=Integer.MAX_VALUE;
        //     for(Integer value : freq.values()){
        //     if(value%2==0){
        //         even=Math.min(value,even);
        //     }
           
        // }
        //     return odd-even;
        // }
        return odd-even;
    }
}