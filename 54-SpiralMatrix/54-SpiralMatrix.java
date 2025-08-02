// Last updated: 8/2/2025, 3:24:35 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minr=0;
        int maxr=matrix.length-1;
        int minc=0;
        int maxc=matrix[0].length-1;
        int total=matrix.length*matrix[0].length;
        int c=0;
        List<Integer> list=new ArrayList<>();
        while(c<total){
            for(int i=minc;i<=maxc && c<total ;i++){
                list.add(matrix[minr][i]);
                c++;
            }
            minr++;

            for(int i=minr;i<=maxr && c<total ;i++){
                list.add(matrix[i][maxc]);
                c++;
            }
            maxc--;

             for(int i=maxc;i>=minc && c<total ;i--){
                list.add(matrix[maxr][i]);
                c++;
            }
            maxr--;

             for(int i=maxr;i>=minr && c<total ;i--){
                list.add(matrix[i][minc]);
                c++;
            }
            minc++;




        }
        return list;
    }
}