class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        int m = nums1.length, n = nums2.length;
        for(int i=Math.max(0, k-m); i<=k && i<=n; i++){
            // for two case: if m is larger than k, or it is smaller
            int[] candidate = merge(maxArray(nums1, k-i), maxArray(nums2, i), k);
            if(great(candidate, ans, 0, 0)) ans = candidate;
        }
        return ans;
    }
    
    public int[] merge(int[] nums1, int[] nums2, int length){
        int[] ans = new int[length];
        for(int i=0, j=0, r=0; r<length; r++){
            ans[r] = great(nums1, nums2, i, j) ? nums1[i++]: nums2[j++];
        }
        return ans;
    }
    
    public boolean great(int[] candidate, int[] merge, int ind1, int ind2){
        // compare just two numbers
        while(ind1<candidate.length && ind2<merge.length && candidate[ind1]==merge[ind2]){
            ind1++; ind2++;
        }
        // if they are all same, or some index in candidate is greater than merge one
        return ind2==merge.length || (ind1<candidate.length && candidate[ind1]>merge[ind2]);
    }
    
    public int[] maxArray(int[] nums, int k){
        int[] ans = new int[k];
        int n = nums.length;
        for(int i=0, j=0; i<n; i++){
            while(n-i+j>k && j>0 && ans[j-1]<nums[i]) j--;
            if(j<k) ans[j++] = nums[i];
        }
        return ans;
    }
}
