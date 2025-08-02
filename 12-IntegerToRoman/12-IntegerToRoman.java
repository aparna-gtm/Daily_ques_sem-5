// Last updated: 8/2/2025, 3:25:38 PM
class Solution {
    public String intToRoman(int num) {
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanSymbols= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder s=new StringBuilder();
        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int times=num/val[i];
            while(times>0){
                s.append(romanSymbols[i]);
                times--;
            }
            num%=val[i];
        }
        return s.toString();
    }
}