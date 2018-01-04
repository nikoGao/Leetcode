class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] output = new int[2];
        int[] temp = new int[nums.length];
        Arrays.fill(temp, 0);
        for(int i:nums){
            temp[i-1]++;
        }
        for(int i=0; i<nums.length; i++){
            if(temp[i]==0) output[1]=i+1;
            if(temp[i]==2) output[0]=i+1;
        }
        return output;
    }
}
