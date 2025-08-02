// Last updated: 8/2/2025, 3:15:31 PM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

       
        for (int num : nums) {
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);

           
            if (freq >= list.size()) {
                list.add(new ArrayList<>());
            }

           
            list.get(freq).add(num);
        }

        return list;
    }
}
