// Last updated: 8/2/2025, 3:19:20 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int basket=2;
        int variety=0;
        int i=0;
        int j=0;
        int max=0;
        int[] freq=new int[fruits.length+9];
        while(j<fruits.length){
            
            //grow
            if(freq[fruits[j]]==0){
                
                
                variety++;
            }
            freq[fruits[j]]++;

           
            
            // shrink
            while(variety>basket){
                
                
                
                freq[fruits[i]]--;
                if(freq[fruits[i]] == 0) {
                     variety--;
                }
                i++;
               
            }
            //ans update
            max=Math.max(max,j-i+1);
            j++;
        }
        
        return max;
    }
}