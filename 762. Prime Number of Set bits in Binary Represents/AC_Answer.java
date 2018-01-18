class Solution {
    public int countPrimeSetBits(int L, int R) {
        int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31};
        int count = 0;
        for(int i=L; i<=R; i++){
            int num = Integer.bitCount(i);
            if(contains(primes, num)) count++;
        }
        return count;
    }
    
    public boolean contains(int[] primes, int value){
        for(int i:primes){
            if(i==value) return true;
        }
        return false;
    }
}
