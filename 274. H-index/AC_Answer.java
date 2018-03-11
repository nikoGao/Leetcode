class Solution {
    public int hIndex(int[] citations) {
        if(citations.length==0) return 0;
        
        int len = citations.length;
        int[] res = new int[len+1];
        for(int i=0; i<len; i++){
            if(citations[i]>len) res[len] += 1;
            else res[citations[i]] += 1;
        }
        
        int result = 0;
        for(int i=len; i>=0; i--){
            result += res[i];
            if(result >= i) return i;
        }
        return 0;
    }
}
