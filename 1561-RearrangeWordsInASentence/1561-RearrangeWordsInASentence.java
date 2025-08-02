// Last updated: 8/2/2025, 3:17:46 PM
class Solution {
    public String arrangeWords(String text) {
        String[] arr=text.split("\s");
        String ans="";
        sort(arr);
        
        if(arr[0].charAt(0)>='a' && arr[0].charAt(0)<='z'){
            ans+=(char)(arr[0].charAt(0)-32);
        }
        else{
            ans+=arr[0].charAt(0);
        }
       
        for(int i=1;i<arr[0].length();i++){
            ans+=arr[0].charAt(i);
        }
         ans+=" ";
        for(int i=1;i<arr.length-1;i++){
           
                ans+=arr[i].toLowerCase()+" "; 
            
            
        }
        ans+=arr[arr.length-1].toLowerCase();
        return ans;
    }
    public static void sort(String[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(j>0 && arr[j-1].length()>arr[j].length()){
                    String temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}