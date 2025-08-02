// Last updated: 8/2/2025, 3:24:14 PM
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/+");
        List<String> ll=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(".") || arr[i].equals("")) continue;
            else if(!arr[i].equals("..")){
                ll.add(arr[i]);
            }
            else if(ll.size()!=0){
                ll.remove(ll.size()-1);
            }
        }
        
        if(ll.size()==0) return "/";
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ll.size();i++){
            sb.append("/");
            sb.append(ll.get(i));
            
        }
        return sb.toString();
    }
}