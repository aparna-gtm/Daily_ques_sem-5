// Last updated: 8/2/2025, 3:17:05 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int lastDigitA  = (coordinates.charAt(0)-'a');
        int lastDigitB  = (coordinates.charAt(1)-'0');
        return (lastDigitA + lastDigitB) % 2 == 0;
    }
}