// Last updated: 8/2/2025, 3:16:10 PM
class Solution {
    public String smallestNumber(String s) {
        int count = 1;
        int j = 0;
        int[] arr = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                arr[i] = count;
                count++;

                j = i - 1;
                while (j>=0 && s.charAt(j) == 'D') {

                    arr[j] = count;
                    count++;
                    j--;

                }
            }

        }
        StringBuilder sb=new StringBuilder();
        for(int i :arr){
            sb.append(i);
        }
        return sb.toString();
    }

}