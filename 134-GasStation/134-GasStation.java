// Last updated: 8/2/2025, 3:23:19 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0){
            return -1;
        }
        int start=0;
        int currentFuel=0;
        for(int i=0;i<cost.length;i++){
            currentFuel+=gas[i]-cost[i];
            if(currentFuel<0){
                currentFuel=0;
                start=i+1;
            }
        }
        return start;
    }
}