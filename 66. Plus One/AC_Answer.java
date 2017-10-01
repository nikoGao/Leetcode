# Run time 1ms, Use System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

class Solution {
    public int[] plusOne(int[] digits) {
        if((digits ==null)||digits.length==0) return new int[0];
        int len = digits.length;
        int flag = 0;
        for(int i = len-1; i>=0; i--){
            if(i==len-1){
                digits[i]++;
            }else{
                digits[i] += flag;
                flag = 0;
            }
            if(digits[i]>=10){
                flag = 1;
                digits[i] %= 10;
            }
        }
        if(flag==1){
            int[] result = new int[len+1];
            System.arraycopy(digits, 0, result, 1, len);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
