// Last updated: 8/2/2025, 3:16:44 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length()<3){
            return false;
        }
        int a=0;
        int b=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                a++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                b++;
            }
        }
        
        return a>b;
        
    }
}