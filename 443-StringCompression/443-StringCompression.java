// Last updated: 8/2/2025, 3:20:49 PM
class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int count=1;
        StringBuilder s=new StringBuilder();
        int j=0;
        for(int i=0;i<chars.length-1;i++){
           
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                s.append(chars[j]);
                if(count!=1){
                    s.append(count);
                }
                count=1;
                j=i+1;

            }
        }
        s.append(chars[j]);
        if(count!=1){
            s.append(count);
        }
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}