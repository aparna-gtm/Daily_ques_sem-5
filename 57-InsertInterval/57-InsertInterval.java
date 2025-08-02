// Last updated: 8/2/2025, 3:24:24 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr=new int[intervals.length+1][2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=intervals[i][j];
            }
        }
        arr[arr.length-1][0]=newInterval[0];
        arr[arr.length-1][1]=newInterval[1];
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int k= mergeIntervals(arr);
        return Arrays.copyOfRange(arr,0,k);
    }
    public static int mergeIntervals(int[][] arr){
        List<List<Integer>> res=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>end){
                List<Integer> list=new ArrayList<>();
                list.add(start);
                list.add(end);
                res.add(list);
                start=arr[i][0];
                end=arr[i][1];

            }
            else{
                end=Math.max(end, arr[i][1]);
            }
        }
        List<Integer> list=new ArrayList<>();
        list.add(start);
        list.add(end);
        res.add(list);

        
        int k=0;
        for(int i=0;i<res.size();i++){
            for(int j=0;j<2;j++){
                arr[i][j]=res.get(i).get(j);
                
            }
            k++;
        }
        return k;
    }
}