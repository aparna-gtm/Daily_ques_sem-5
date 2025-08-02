// Last updated: 8/2/2025, 3:16:30 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int result=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count!=0){
                list.add(count);
            }
            
        }
       // System.out.println(list);
        for(int i=0;i<list.size()-1;i++){
            result+=list.get(i)*list.get(i+1);
        }
        return result;
    }
}