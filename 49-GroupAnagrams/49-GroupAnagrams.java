// Last updated: 8/2/2025, 3:24:44 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr= strs[i].toCharArray();

            Arrays.sort(arr);
            String string= new String(arr);

            map.putIfAbsent(string, new ArrayList<>());
            map.get(string).add(strs[i]);

        }
        return new ArrayList<>(map.values());
    }
}