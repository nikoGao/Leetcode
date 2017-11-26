class Solution {
    public int[] constructRectangle(int area) {
        int mid=(int)Math.sqrt(area);
        int L=mid, W=mid;
        int[] res = new int[2];
        while(L*W!=area){
            if(L*W<area) L++;
            if(L*W>area) W--;
        }
        res[0] = L;
        res[1] = W;
        return res;
    }
}
