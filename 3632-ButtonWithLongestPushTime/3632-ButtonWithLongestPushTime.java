// Last updated: 8/2/2025, 3:14:45 PM
class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int diff = events[0][1];  
        int result = events[0][0];  
        
        for (int i = 1; i < events.length; i++) {
            int duration = events[i][1] - events[i-1][1];
            
            if (duration > diff || (duration == diff && events[i][0] < result)) {
                diff = duration;
                result = events[i][0];
            }
        }
        return result;
    }
}
