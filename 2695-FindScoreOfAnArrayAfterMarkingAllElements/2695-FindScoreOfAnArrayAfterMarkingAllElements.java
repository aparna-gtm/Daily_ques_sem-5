// Last updated: 8/2/2025, 3:15:35 PM
class Solution {
    public long findScore(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        boolean[] visited=new boolean[nums.length];
        long sum=0;
       
        int[][] matrix=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            matrix[i][0]=nums[i];
            matrix[i][1]=i;
        }

        Arrays.sort(matrix,(a,b)-> Integer.compare(a[0],b[0]));

        for(int[] row : matrix){
             int value = row[0];
            int idx = row[1];

            if (visited[idx]) {
                continue;
            }
            sum+=value;
            visited[idx]=true;
            if (idx-1>=0){
                visited[idx-1]=true;
            }
            if(idx+1<=nums.length-1){
                visited[idx+1]=true;
            }

        }
        return sum;

        

    }
}