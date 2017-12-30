//2^p−1(2^p − 1) 
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        int sum=0;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) {
                sum += i;
                if(i!=num/i) sum += num/i;
            }
        }
        sum++;
        return sum==num;
    }
}
