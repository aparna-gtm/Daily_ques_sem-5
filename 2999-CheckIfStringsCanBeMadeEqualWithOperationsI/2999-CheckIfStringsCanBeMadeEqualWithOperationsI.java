// Last updated: 8/2/2025, 3:15:18 PM
class Solution {
    public boolean canBeEqual(String s1, String s2) {
       char[] s=new char[4];
       if(s1.equals(s2)){
        return true;
       }
       for(int i=0;i<2;i++){
           if(s1.charAt(i)==s2.charAt(i+2)){
             s[i]=s1.charAt(i+2);
             s[i+2]=s1.charAt(i);
           }
           else{
            s[i]=s1.charAt(i);
            s[i+2]=s1.charAt(i+2);
           }
       }
      // System.out.println(Arrays.toString(s));
       StringBuilder n=new StringBuilder();
       for(int i=0;i<4;i++){
            n.append(s[i]);

       }
       return n.toString().equals(s2);

    }
}