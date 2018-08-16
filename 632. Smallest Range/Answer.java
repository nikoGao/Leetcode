class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] result = new int[2];
        int k = nums.size();
        result[1] = Integer.MAX_VALUE;
        int[] index = new int[k];
        int length = 0;
        for(List<Integer> n:nums) length += n.size();
        int start = 0, row1 = 0;
        
        while(start<length){
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int i=0; i<index.length; i++){
                max = Math.max(max, nums.get(i).get(index[i]));
                if(nums.get(i).get(index[i]) < min){
                    min = nums.get(i).get(index[i]);
                    row1 = i;
                }
            }
            if(max-min<result[1]-result[0] || (max-min==result[1]-result[0] && min<result[0])){
                result[1] = max;
                result[0] = min;
            }
            index[row1]++;
            if(nums.get(row1).size()==index[row1]) break;
            start++;
        }
        return result;
    }
}
