// Last updated: 8/2/2025, 3:14:26 PM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score=0;
        int idx=0;
        while(idx>=0 && idx< instructions.length){
            if(instructions[idx].equals("jump")){
                instructions[idx]="visited";
                idx+=values[idx];
            }
            else if(instructions[idx].equals("add")){
                instructions[idx]="visited";
                score+=values[idx];
                idx++;
            }
            else{
                break;
            }
          
        }
        return score;
    }
}