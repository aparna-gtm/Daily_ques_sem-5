// Last updated: 8/2/2025, 3:14:42 PM
class Solution {
    public boolean hasMatch(String s, String p) {
      
        if (p.equals("*")) {
            return true;
        }
        
        String[] arr = p.split("\\*");
        
        int j = arr[0].length();
        int f = 0;
        int k = 0;

        
        for (int i = 0; i <= s.length() - j; i++) {
            if (s.substring(i, i + j).equals(arr[0])) {
                k = i + j;
                f = 1;
                break;
            }
        }
        
       
       

        int r = 0;
   
        if (f == 1 && arr.length > 1) {
            int ff = arr[1].length();
            for (int i = k; i + ff <= s.length(); i++) {
                if (s.substring(i, i + ff).equals(arr[1])) {
                    r = 1;
                    break;
                }
            }
        }

        return f == 1 && (arr.length == 1 || r == 1);
    }
}
