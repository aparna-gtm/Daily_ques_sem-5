// Last updated: 8/2/2025, 3:19:25 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[j]+people[i]<=limit){
                count++;
                i++;
                j--;
            }
            else if(people[j]<=limit){
                count++;
                j--;
            }
            
        }
        return count;
    }
}