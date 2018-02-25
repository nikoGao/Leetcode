class Solution {
    public String largestNumber(int[] nums) {
        String s = "";
        if(nums.length==0) return s;
        String[] s_nums = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            s_nums[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String s1, String s2){
                String s_1 = s1 + s2;
                String s_2 = s2 + s1;
                return s_2.compareTo(s_1);
            }
        };
        Arrays.sort(s_nums, comp);
        StringBuilder sb = new StringBuilder();
        if(s_nums[0].charAt(0) == '0'){
            return "0";
        }
        for(String t: s_nums){
            sb.append(t);
        }
        return sb.toString();
    }
}
