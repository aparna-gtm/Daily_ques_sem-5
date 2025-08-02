// Last updated: 8/2/2025, 3:18:51 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        int carry = 0;
        int i = num.length - 1;

       
        while (i >= 0 || k > 0 || carry > 0) {
            int last_one = (i >= 0) ? num[i] : 0; 
            int last_two = k % 10; 

            int sum = last_one + last_two + carry; 
            res.add(sum % 10); 
            carry = sum / 10; 

            k /= 10;
            i--; }


      
        Collections.reverse(res);
        return res;
    }
}
