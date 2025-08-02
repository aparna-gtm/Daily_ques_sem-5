// Last updated: 8/2/2025, 3:25:01 PM
class Solution {
    public String countAndSay(int n) {
        return helper(n);
    }
    public static String helper(int n){
        if(n==1){
            return "1";
        }
        String say=helper(n-1);
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        int count=0;
        while(j<say.length()){
            if(say.charAt(i)==say.charAt(j)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(say.charAt(i));
                i=j;
                count=1;
            }
            j++;
        }
        sb.append(count);
        sb.append(say.charAt(i));
        return sb.toString();
    }
}