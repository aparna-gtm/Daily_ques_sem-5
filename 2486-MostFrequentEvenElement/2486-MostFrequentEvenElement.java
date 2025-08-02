// Last updated: 8/2/2025, 3:16:03 PM
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

       
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        
        int mostFrequent = -1;
        int maxFrequency = 0;

        
        for (Integer key : freqMap.keySet()) {
            
            if (key % 2 == 0) {
                int frequency = freqMap.get(key);

               
                if (frequency > maxFrequency || (frequency == maxFrequency && key < mostFrequent)) {
                    mostFrequent = key;
                    maxFrequency = frequency;
                }
            }
        }

        return mostFrequent;
    }
}
