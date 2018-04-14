class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int width = 0;
        int[] res = {0,0};
        for(char c:S.toCharArray()){
            if(width+widths[c-'a']<=100){
                width += widths[c-'a'];
            }else{
                res[0]++;
                width = widths[c-'a'];
            }
        }
        if(width !=0) {
            res[0]++;
            res[1] = width;
        }
        return res;
    }
}
