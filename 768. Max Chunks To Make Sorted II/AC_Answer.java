class Solution {
    public int maxChunksToSorted(int[] arr) {
        // Iterate through the array, each time all elements to the left are smaller (or equal) to all elements to the right, there is a new chunck.
        int[] leftOfMax = new int[arr.length];
        int result = 0;
        leftOfMax[0] = arr[0];
        for(int i=1; i<arr.length; i++) leftOfMax[i] = Math.max(arr[i], leftOfMax[i-1]);
        
        int rightOfMin = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            rightOfMin = Math.min(arr[i], rightOfMin);
            if(leftOfMax[i-1]<=rightOfMin) result++; // can be separated into two chunks, as max of left< min of right
        }
        return result + 1;
    }
}
