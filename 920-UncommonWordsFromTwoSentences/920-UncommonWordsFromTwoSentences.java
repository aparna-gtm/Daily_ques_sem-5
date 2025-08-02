// Last updated: 8/2/2025, 3:19:23 PM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1= s1.split(" ");
        String[] a2=s2.split(" ");
        
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<a1.length;i++){
            map.put(a1[i], map.getOrDefault( a1[i] , 0 )+1);
        }
        for(int i=0;i<a2.length;i++){
            map.put(a2[i], map.getOrDefault( a2[i] , 0 )+1);
        }
         ArrayList<String> list=new ArrayList<>();
        for(String i : map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        String[] arr=new String[list.size()];
       
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}