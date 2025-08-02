// Last updated: 8/2/2025, 3:24:47 PM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            reverse(matrix,i);
        }
        

    }
    public static void reverse(int[][] arr,int i){
        int k=0;
        while(k<arr[i].length/2){
            int temp=arr[i][k];
            arr[i][k]=arr[i][arr[i].length-1-k];
            arr[i][arr[i].length-1-k]=temp;
            k++;
        }
    }
}