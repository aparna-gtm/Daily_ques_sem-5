// Last updated: 8/2/2025, 3:14:07 PM
class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> unique=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    if(digits[k]%2==0){
                        int found=digits[i]*100+digits[j]*10+digits[k];
                        unique.add(found);
                    }
                }
            }
        }
        return unique.size();
    }
}