// dynamic plan problem, only two probability, 1) not rob current house, then choose the largest sum between rob previous one and not rob previous
2) rob current, then sum= not rob previous + current values

class Solution {
    public int rob(int[] nums) {
        int prevNo = 0;
        int prevYes = 0;
        for(int i:nums){
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = i + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}
