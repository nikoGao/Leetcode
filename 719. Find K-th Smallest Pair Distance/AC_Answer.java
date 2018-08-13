class Solution {
    // all distances are count, including duplicated ones
    // Total runtime O(N*logd * N * logN + NlogN)
    public int smallestDistancePair(int[] nums, int k) {
        int N = nums.length;
        // 1) the range of distance is in the range of [0, d] where d is the max distance between max and min
        Arrays.sort(nums); // runtime O(NlogN)
        int lo = 0, hi = nums[N-1]-nums[0];
        while(lo<hi){
            // 2) do the binary search on the distance
            int mid = (lo + hi)/2;
            // 3) need to count the number of distance <=mid
            int count = 0, left = 0;
            for(int right =0; right<N; right++){
                while(nums[right]-nums[left]>mid) left++;
                count += right-left; // add the number of distance
            }
            if(count>=k) hi = mid; // the number of distances on the left of mid has already exceed or equal to k, need to search on left
            else lo = mid+1;
        }
        return lo;
    }
}
