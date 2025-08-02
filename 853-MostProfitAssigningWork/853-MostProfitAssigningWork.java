// Last updated: 8/2/2025, 3:19:41 PM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] jobs=new int[profit.length][2];
        for(int i=0;i<profit.length;i++){
            jobs[i]=new int[]{difficulty[i],profit[i]};
        }
        Arrays.sort(jobs, (a,b) -> Integer.compare(a[0],b[0]));
        for (int i = 1; i < jobs.length; i++) {
            jobs[i][1] = Math.max(jobs[i][1], jobs[i - 1][1]);
        }
        int result=0;
        for(int i=0;i<worker.length;i++){
            int max=0;
            int ans=-1;
            int start=0;
            int end=jobs.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(jobs[mid][0]>worker[i]){
                    
                    end=mid-1;
                }
                else{
                    ans=mid;
                   start=mid+1;
                }
            }
           if(ans!=-1){
            System.out.println(jobs[ans][1]);
           }
            max = Math.max(max, ans != -1 ? jobs[ans][1] : 0);

            result+=max;
        }
        return result;
    }
}