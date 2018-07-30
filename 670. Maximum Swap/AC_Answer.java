class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        int[] indexes = new int[10];
        for(int i=0; i<digits.length; i++){
            indexes[digits[i]-'0'] = i;
        }
        
        for(int i=0; i<digits.length; i++){
            for(int k=9; k>digits[i]-'0'; k--){
                if(indexes[k]>i){
                    char temp = digits[i];
                    digits[i] = digits[indexes[k]];
                    digits[indexes[k]] = temp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }
        return num;
    }
}
