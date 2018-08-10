class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> sumUp = new HashMap<>();
        int count = 0;
        for(List<Integer> row:wall){
            int sum = 0;
            for(int i=0; i<row.size()-1; i++){
                sum += row.get(i);
                sumUp.put(sum, sumUp.getOrDefault(sum, 0)+1);
                count = Math.max(count, sumUp.get(sum));
            }
        }
        return wall.size() - count;
    }
}
