// Last updated: 8/2/2025, 3:21:31 PM
class Solution {
    public String reverseVowels(String s) {
        char[] vowels=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowels[k++]=s.charAt(i);

            }
        }
        vowels=Arrays.copyOfRange(vowels, 0, k);
        String result="";
        int l=vowels.length-1;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                result+=vowels[l];
                l--;

            }
            else{
                result+=s.charAt(i);
            }
        }
        return result;


    }
    public static boolean isVowel(char a){
        if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A' ||a=='E' ||a=='I' ||a=='O' ||a=='U' ){
            return true;
        }
        return false;
    }
}