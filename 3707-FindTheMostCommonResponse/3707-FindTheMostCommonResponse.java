// Last updated: 8/2/2025, 3:14:36 PM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map=new HashMap<>();

        for(List<String> i : responses){
            Set<String> unique=new HashSet<>(i);

            for(String s:unique){
                map.put(s,map.getOrDefault(s,0)+1);
            }
            
        }
        String ans="";
        int mf=0;

        for(Map.Entry<String,Integer> e: map.entrySet()){
            String res=e.getKey();
            int c=e.getValue();

            if(c>mf || (c==mf && res.compareTo(ans)<0)){
                mf=c;
                ans=res;
            }
            
        }
        return ans;
    
    }
}