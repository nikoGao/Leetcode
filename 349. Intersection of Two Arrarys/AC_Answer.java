class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<Integer>();
        int i = 0, j= 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) {
                if(!list.contains(nums1[i]))
                    list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
        }
        int[] arr = new int[list.size()];
        int k = 0;
        for(Integer num:list){
            arr[k++] = num;
        }
        return arr;
    }
}
