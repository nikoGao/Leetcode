/**    Create a bit mask which has N bits of 1 from RIGHTMOST. In above example, the mask is 111. And we can use the decent Java built-in function Integer.highestOneBit to get the LEFTMOST bit of 1, left shift one, and then minus one. Please remember this wonderful trick to create bit masks with N ones at RIGHTMOST, you will be able to use it later.
    Negate the whole input number.
    Bit AND numbers in step 1 and 2.
**/

class Solution {
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num)-1);
    }
}
