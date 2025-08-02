// Last updated: 8/2/2025, 3:18:32 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int i=0;i<list.size();i++){
            if (!map.containsKey(list.get(i))) {
                 map.put(list.get(i), r);
                r++;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}