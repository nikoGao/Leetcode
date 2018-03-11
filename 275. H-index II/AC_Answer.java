class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        if(len==0) return 0;
        int l=0, r = len;
        while(l<r){
            int mid = (r-l)/2 + l;
            if(citations[mid]==len-mid) return len-mid;
            else if(citations[mid]< len-mid) l = mid+1;
            else r = mid;
        }
        return len-l;
    }
}
