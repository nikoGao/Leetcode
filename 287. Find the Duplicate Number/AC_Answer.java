/*
suppose the array is

index: 0 1 2 3 4 5

value: 2 5 1 1 4 3

first subtract 1 from each element in the array, so it is much easy to understand.
use the value as pointer. the array becomes:

index: 0 1 2 3 4 5

value: 1 4 0 0 3 2

enter image description here

Second if the array is

index: 0 1 2 3 4 5

value: 0 1 2 4 2 3

we must choose the last element as the head of the linked list. If we choose 0, we can not detect the cycle.

*/
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
