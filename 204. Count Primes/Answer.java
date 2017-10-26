//limit time exceed
class Solution {
    public boolean helper(int elem){
        int end = (int)Math.sqrt(elem);
        if(elem==1 && end==1) return false;
        else if(end==1) return true;
        else{
            for(int i = 2; i<=end; i++){
                if(elem%i==0) return false;
            }
            return true;
        }
    }
    public int countPrimes(int n) {
        int count = 0;
        if(n==0) return count;
        for(int i =1; i<n; i++){
            if(helper(i)) count++;
        }
        return count;
    }
}
