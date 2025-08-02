// Last updated: 8/2/2025, 3:24:18 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit=digits[digits.length-1]%10;
        if(lastDigit!=9){
            digits[digits.length-1]+=1;
            
        }else{
            
            int f=0;
            for(int i=0;i<digits.length;i++){
                if(digits[i]!=9){
                    f=1;
                }

            }
            if(f==0){
                int[] arr=new int[digits.length+1];
                arr[0]=1;
                return arr;
            }
            else{
                for(int i=digits.length-1;i>=0;i--){
                    if(digits[i]==9){
                        digits[i]=0;
                    }
                    else{
                        digits[i]+=1;
                        break;
                    }
                }
                
            }
            
            

        }
        return digits;
    }
}