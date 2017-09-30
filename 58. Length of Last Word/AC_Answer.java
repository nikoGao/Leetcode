# Slow one, O(n) time, 7ms

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last = 0;
        if (s.length()==0) return count;
        int len = s.length();
        for(int i = 0; i< len; i++){
            if (s.charAt(i) != ' ') count++;
            else {
                if (count != 0) last = count;
                count = 0;
            }
        }
        if (count != 0) return count;
        return last;
    }
}
