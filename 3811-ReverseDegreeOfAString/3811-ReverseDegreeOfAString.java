// Last updated: 8/2/2025, 3:14:05 PM
class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int c=26-(s.charAt(i)-'a');
            res+= (c*(i+1));
            System.out.println(res);
        }
        return res;
    }
}