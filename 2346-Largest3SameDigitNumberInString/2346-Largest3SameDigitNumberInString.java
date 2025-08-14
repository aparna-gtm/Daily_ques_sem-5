// Last updated: 8/14/2025, 12:00:29 PM
class Solution {
    public String largestGoodInteger(String num) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            int c=1;
            int idx=i;
            for(int j=i+1;j<num.length();j++){
                if(num.charAt(i)==num.charAt(j)){
                    c++;
                    idx=j;
                }
                else{
                    break;
                }
            }
            if(c>=3){
                list.add(num.substring(i,i+3));
            }
        }
        if(list.size()>0){
            Collections.sort(list);
            return list.get(list.size()-1);
        }
        return "";
    }
}