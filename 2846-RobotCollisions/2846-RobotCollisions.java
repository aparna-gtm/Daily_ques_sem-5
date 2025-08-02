// Last updated: 8/2/2025, 3:15:25 PM
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] index=new int[positions.length];
        int[] sorted=new int[positions.length];
        
        for(int i=0;i<positions.length;i++){
            map.put(positions[i],i);
            sorted[i]=positions[i];
        }
        Arrays.sort(sorted);
        for(int i=0;i<positions.length;i++){
            index[i]=map.get(sorted[i]);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<index.length;i++){
            if(directions.charAt(index[i])=='R'){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && healths[index[i]]>0){
                    int top=st.pop();
                    if(healths[index[top]]> healths[index[i]]){
                        healths[index[top]]--;
                        healths[index[i]]=0;
                        st.push(top);
                    }
                    else if(healths[index[top]]< healths[index[i]]){
                        healths[index[i]]--;
                        healths[index[top]]=0; 
                    }
                    else{
                        healths[index[top]]=0;
                        healths[index[i]]=0; 
                    }
                }
            }
        }
        List<Integer> ll=new ArrayList<>();
        for(int i : healths){
            if(i>0){
                ll.add(i);
            }
        }
        return ll;
    }
}