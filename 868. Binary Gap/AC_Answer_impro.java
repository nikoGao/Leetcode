class Solution {
    public int binaryGap(int N) {
        int first = -1, i=0, distance = 0;
        while(N!=0){
            if(N%2==1){
                if(first == -1) first = i;
                else{
                    distance = Math.max(i-first, distance);
                    first = i;
                }
            }
            i++;
            N /= 2;
        }
        return distance;
    }
}
