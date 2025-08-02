// Last updated: 8/2/2025, 3:19:51 PM
class Solution {
    public int reachNumber(int target) {
        if(target==0){
            return 0;
        }
        target = Math.abs(target);
        int steps=0;
        int current_pos=0;
        while(current_pos<target || (current_pos-target)%2!=0){
            steps++;
            current_pos+=steps;
        }
        return steps;
    }
}