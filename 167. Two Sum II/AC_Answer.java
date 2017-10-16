// If use binary search, this will take O(nlgn) time on both best and worst case
// So the best way to do is to use two pointer, O(n) time

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0, end = numbers.length-1;
        boolean terminate = false;
        while(!terminate){
            if(numbers[start]+numbers[end]==target) terminate = true;
            else if(numbers[start]+numbers[end] > target) end--;
            else start++;
        }
        result[0] = start+1;
        result[1] = end+1;
        return result;
    }
}
