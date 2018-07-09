class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        // to ensure i is in the smallest length of array
        if(m>n){
            return findMedianSortedArrays(nums2, nums1);
        }
        int imin=0, imax = m, half = (m+n+1)/2;
        while(imin<=imax){
            int i = (imin+imax)/2;
            int j = half - i;
            if(i<m && nums1[j-1]>nums2[i]){
                // means i is smaller, increase i
                imin = i + 1;
            }else if(i>0 && nums1[j] < nums2[i-1]){
                //means i is too big, decrease i
                imax = i - 1;
            }else{
                // find the propriate i, find the median basing on odd or even length
                int max_left = 0, min_right = 0;
                // odd length, max left
                if(i==0) max_left = nums1[j-1];
                else if(j==0) max_left = nums2[i-1];
                else max_left = Math.max(nums1[j-1], nums2[i-1]);
                if((n+m)%2==1) return (double)max_left;
                //even length, (max_left+min_right)/2
                if(i==m) min_right = nums1[j];
                else if(j==n) min_right = nums2[i];
                else min_right = Math.min(nums1[j], nums2[i]);
                return ((double)max_left + min_right)/2; 
            }    
        }
        return -10;
    }
}
