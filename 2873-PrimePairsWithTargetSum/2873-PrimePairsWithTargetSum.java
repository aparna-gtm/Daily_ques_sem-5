// Last updated: 8/2/2025, 3:15:23 PM
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result=new ArrayList<>();
        int i=2;
        int j=n-2;
        while(i<=j){
             List<Integer> answer=new ArrayList<>();
            if(isPossible(i,j)){
                answer.add(i);
                answer.add(j);
                result.add(answer);
            }
            i++;
            j--;
        }
        return result;

    }
    public static boolean isPossible(int a , int b){
        return isPrime(a) && isPrime(b);
    }
    public static boolean isPrime(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}