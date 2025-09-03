// Last updated: 9/3/2025, 12:19:36 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        for(int i=0;i<freq.length;i++) {
            freq[i]=-1;
        }
        while(n>0){
            int rem=n%10;
            if (freq[rem]==-1) freq[rem]+=2;
            else freq[rem]++;
            n/=10;
        }
        //System.out.println(Arrays.toString(freq));
        int min=Integer.MAX_VALUE;
          int mini=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=-1 && freq[i]<min){
               
                 min=Math.min(min,freq[i]);
                mini=i;
                
            }
        }
        return mini;
    }
}