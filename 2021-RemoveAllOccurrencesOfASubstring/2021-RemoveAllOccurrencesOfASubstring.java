// Last updated: 8/2/2025, 3:16:55 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        int p=s.indexOf(part);
        int len=part.length();
        while(p!=-1){
            s=s.substring(0,p)+ s.substring(p+len,s.length());
            p=s.indexOf(part);
        }
        return s;
    }
}