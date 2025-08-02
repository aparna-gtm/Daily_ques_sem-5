// Last updated: 8/2/2025, 3:24:21 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=n-1;
        int total=n*n;
        int c=0;
        int num=1;
        List<Integer> list=new ArrayList<>();
        while(c<total){
            for(int i=minc;i<=maxc && c<total ;i++){
                arr[minr][i]=num;
                num++;
                c++;
            }
            minr++;

            for(int i=minr;i<=maxr && c<total ;i++){
                arr[i][maxc]=num;
                num++;
                c++;
            }
            maxc--;

             for(int i=maxc;i>=minc && c<total ;i--){
                arr[maxr][i]=num;
                num++;
                c++;
            }
            maxr--;

             for(int i=maxr;i>=minr && c<total ;i--){
                arr[i][minc]=num;
                num++;
                c++;
            }
            minc++;




        }
        return arr;
    }
}