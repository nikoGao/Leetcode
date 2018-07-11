class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] appear = new int[nums.length];
        for(int n:nums) appear[n-1] += 1;
        for(int i=0; i<appear.length; i++){
            if(appear[i]==2) result.add(i+1);
        }
        return result;
    }
}
