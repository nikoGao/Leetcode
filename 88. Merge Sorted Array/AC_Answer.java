/***
Can't find from the start, too time consuming
Check from the end, moving to the front
Since nums1[] has enough space, compare two array elems, put the larger at back
Consider if the rest nums2[] all smaller than elems in nums1
***/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i>-1&&j>-1) nums1[k--] =(nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        while(j>-1)       nums1[k--] = nums2[j--];
    }
}
