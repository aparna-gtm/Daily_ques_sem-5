// Last updated: 8/2/2025, 3:16:46 PM
class Solution {
    public int maxConsecutiveAnswers(String answer, int k) {
        int flip_a=max_len(answer,k,'T');
        int flip_b=max_len(answer,k,'F');
        return Math.max(flip_a,flip_b);
    }
    public static int max_len(String answer, int k, char ch){
        int i=0;
        int j=0;
        int flip=0;
        int ans=0;
        while(j<answer.length()){
            if(answer.charAt(j)==ch){
                flip++;
            }
            while(flip>k && i<=j){
                if(answer.charAt(i)==ch){
                    flip--;
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}