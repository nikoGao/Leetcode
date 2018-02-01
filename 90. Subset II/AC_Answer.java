class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> output = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<=nums.length; i++){
            findSubset(output, nums, 0, i, new ArrayList<>());
        }
        for(List<Integer> s: output){
            res.add(s);
        }
        return res;
    }
    
    public void findSubset(Set<List<Integer>> output, int[] nums, int index, int length, List<Integer> c){
        if(length==0){
            output.add(new ArrayList<>(c));
            return;
        }else{
            for(int i=index; i<nums.length; i++){
                c.add(nums[i]);
                findSubset(output, nums, i+1, length-1, c);
                c.remove(c.size()-1);
            }
        }
    }
}
