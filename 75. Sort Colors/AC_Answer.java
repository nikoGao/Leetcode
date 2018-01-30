class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
    }
    
    public void mergeSort(int[] nums, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    
    public void merge(int[] nums, int left, int mid, int right){
        int len1 = mid-left+1, len2 = right-mid;
        int[] array1 = Arrays.copyOfRange(nums, left, mid+1);
        int[] array2 = Arrays.copyOfRange(nums, mid+1, right+1);
        int i=0, j=0, k=left;
        while(i<len1 && j<len2){
            if(array1[i]<=array2[j]){
                nums[k++] = array1[i];
                i++;
            }else{
                nums[k++] = array2[j];
                j++;
            }
        }
        while(i<len1) nums[k++] = array1[i++];
        while(j<len2) nums[k++] = array2[j++];
    }
}
