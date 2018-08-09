class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // O(n^2) time complexity, O(N) space complexity
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:A){
            for(int j:B){
                map.put(i+j, map.getOrDefault(i+j, 0)+1);
            }
        }
        
        int result = 0;
        for(int i:C){
            for(int j:D){
                result += map.getOrDefault(-i-j, 0);
            }
        }
        return result;
    }
}
