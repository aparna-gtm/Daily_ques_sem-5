// Last updated: 8/2/2025, 3:16:00 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        while(i<players.length&&j<trainers.length)
        {
            if(players[i]<=trainers[j])
                i++;
            j++;
            
        }
        return i;
    }
}