// Last updated: 8/2/2025, 3:17:57 PM
import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        for (int key : freqMap.keySet()) {
            if (key == freqMap.get(key)) {
                result = Math.max(result, key);
            }
        }
        return result;
    }
}
