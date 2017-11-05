// change string to char
class Solution {
    public String reverseString(String s) {
        if(s.length()==0) return s;
        char[] str = s.toCharArray();
        int len = s.length();
        for(int i = 0; i< len/2; i++){
            char temp = str[i];
            str[i] = str[len-i-1];
            str[len-i-1] = temp;
        }
        return new String(str);
    }
}
