// Last updated: 8/2/2025, 3:13:58 PM
class Solution {
    static char[] arr = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    public String concatHex36(int n) {
        StringBuilder ans1=new StringBuilder();
        int n2=n*n;
        if (n2 == 0) ans1.append('0');
        while(n2>0){
            int rem=n2%16;
        
            ans1.append(arr[rem]);
            
            
            n2/=16;
        }
        int n3=n*n*n;
        StringBuilder ans2=new StringBuilder();
        if (n3 == 0) ans2.append('0');
        while(n3>0){
            int rem=n3%36;
            ans2.append(arr[rem]);
            n3/=36;
        }
        ans1.reverse();
        ans2.reverse();
        
        return ans1.toString() + ans2.toString();
    }
}