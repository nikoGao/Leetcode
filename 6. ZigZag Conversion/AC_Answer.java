class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++) sb[i] = new StringBuffer();
        
        int i = 0;
        while(i<len){
            for(int down=0; down<numRows && i<len; down++) sb[down].append(c[i++]);
            for(int up = numRows-2; up>=1 && i<len; up--) sb[up].append(c[i++]);
        }
        
        for(int j=1; j<numRows; j++) sb[0].append(sb[j]);
        return sb[0].toString();
    }
}
