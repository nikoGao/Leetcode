class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] result = new int[2];
        result[1] = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // override the compare function of PriorityQueue, to make it order by elements in nums
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o->nums.get(o[0]).get(o[1])));
        for(int i=0; i<nums.size(); i++){
            q.offer(new int[]{i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        int start = Integer.MAX_VALUE;
        while(q.size()==nums.size()){
            // when a list find to it's last element+1, then stop the compare
            int[] smallest = q.poll();
            int row = smallest[0], col = smallest[1];
            if(max - nums.get(row).get(col) < result[1]-result[0] || 
               (max - nums.get(row).get(col) == result[1]-result[0]) && nums.get(row).get(col)< result[0]){
                result[1] = max;
                result[0] = nums.get(row).get(col);
            }
            if(col< nums.get(row).size()-1){
                q.offer(new int[]{row, col+1});
                max = Math.max(max, nums.get(row).get(col+1));
            }
        }
        return result;
    }
}
