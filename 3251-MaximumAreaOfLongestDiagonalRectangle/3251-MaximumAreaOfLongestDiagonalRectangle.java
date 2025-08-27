// Last updated: 8/27/2025, 12:17:48 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int len=dimensions[i][0];
            int wid=dimensions[i][1];
            int dia=((len*len)+(wid*wid));
            int currArea=len*wid;
          //  System.out.println(dia+" "+max+" "+area);
            if((dia==max && currArea>area ) || dia>max){
                max=dia;
                area=currArea;
            }
        }
        return area;
    }
}