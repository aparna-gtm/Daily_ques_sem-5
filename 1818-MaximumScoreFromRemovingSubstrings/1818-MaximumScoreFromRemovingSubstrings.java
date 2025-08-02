// Last updated: 8/2/2025, 3:17:20 PM
class Solution {
    public int maximumGain(String s, int x, int y) {
        String max_str = "";
        String min_str = "";
        int total = 0;

        if (x > y) {
            max_str = "ab";
            min_str = "ba";
        } else {
            max_str = "ba";
            min_str = "ab";
        }

        int max_score = Math.max(x, y);
        int min_score = Math.min(x, y);

        String temp_str = remove(s, max_str);
        total += ((s.length() - temp_str.length()) / 2) * max_score;

        String final_str = remove(temp_str, min_str);
        total += ((temp_str.length() - final_str.length()) / 2) * min_score;

        return total;
    }

    public static String remove(String s, String match) {
        StringBuilder sb=new StringBuilder();
        
        int i=0;
        int j=0;
        while(j<s.length()){
            sb.append(s.charAt(j));
            i++;
            if(i>1 && sb.charAt(i-1)==match.charAt(1) && sb.charAt(i-2)==match.charAt(0)){
                sb.delete(i - 2, i);
                i-=2;
            }
            
            j++;
        }
        return sb.substring(0,i).toString();
            
    }
}
