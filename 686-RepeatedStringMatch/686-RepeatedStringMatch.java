// Last updated: 8/2/2025, 3:20:03 PM
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)) return count;
        if(sb.append(a).toString().contains(b)) return ++count;
        return -1;
    }
}