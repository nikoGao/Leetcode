class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int cur = 0, i=0;
        while(i<bits.length){
            if(bits[i]==0){
                cur = 1;
                i++;
            }else{
                cur = 2;
                i+=2;
            }
        }
        return cur==1;
    }
}
