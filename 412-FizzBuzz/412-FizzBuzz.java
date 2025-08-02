// Last updated: 8/2/2025, 3:21:04 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        int  c3=1;
        int  c5=1;
        for(int i=1;i<=n;i++){
            String s="";

            if(c3==3){
                s+="Fizz";
                c3=0;
            }
            if(c5==5){
                s+="Buzz";
                c5=0;
            }
            else if(s=="") {
                s+=Integer.toString(i);
            }
            list.add(s);
            c3++;
            c5++;
        }
        return list;
    }
}