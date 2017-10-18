// Use time 1ms

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int move = k%length;
        int[] rotate = Arrays.copyOfRange(nums, 0, length);
        for(int i = 0; i< length; i++){
            nums[(i+k)%length] = rotate[i];
        }
    }
}
