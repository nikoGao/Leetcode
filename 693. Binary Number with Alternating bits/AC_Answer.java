class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        boolean result = true;
        for(int i=0; i<binary.length()-1; i++){
            result &= (binary.charAt(i) != binary.charAt(i+1));
        }
        return result;
    }
}
