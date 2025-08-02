// Last updated: 8/2/2025, 3:17:33 PM
class Solution {
    public int minFlips(String target) {
        int count=0;
        if(target.charAt(0)=='0'){
            count--;
        }
        if(!target.contains("1")){
            return 0;
        }
        for(int i=0;i<target.length()-1;i++){
            if(target.charAt(i)!=target.charAt(i+1)){
                count++;
            }
        }
        return count+1;
    }
}