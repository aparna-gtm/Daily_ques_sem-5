// Last updated: 8/2/2025, 3:18:08 PM
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[] using a loop
        Integer[] integerArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integerArr[i] = arr[i]; // Manual conversion
        }

        // Custom sort: First by number of 1s in binary representation, then by value
        Arrays.sort(integerArr, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            return bitCountA == bitCountB ? Integer.compare(a, b) : Integer.compare(bitCountA, bitCountB);
        });

        // Convert Integer[] back to int[] using a loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integerArr[i];
        }
        
        return arr;
    }

    
}
