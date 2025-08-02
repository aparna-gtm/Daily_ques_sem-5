// Last updated: 8/2/2025, 3:25:15 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
       
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(0)){
                int start=i;
                int idx=i;
                int c=0;
                for(int k=0;k<needle.length();k++){
                    if(idx<haystack.length() && needle.charAt(k)==haystack.charAt(idx)){
                        idx++;
                        
                        c++;
                    }
                    else{
                       
                        break;
                    }
                    
                    if(c==needle.length()){
                        return start;
                    }
                   
                    
                }
            }
            i++;
        }
        return -1;

    }
}