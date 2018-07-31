class Solution {
    public int maxChunksToSorted(int[] arr) {
        // compare current index with current max value
        // if meets equality, means the end of the disorder part or it's in order
        if(arr.length==0) return 0;
        int count = 0, max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            if(max==i) count++;
        }
        return count;
    }
}
