class Solution {
    public int nextGreaterElement(int n) {
        // change n to an array, then it's same like doing in array
        char[] nc = Integer.toString(n).toCharArray();
        // first, find from right, assume we want to check a descending order
        int i=nc.length-1;
        for(;i>0; i--){
            if(nc[i]>nc[i-1]) break;
        }
        if(i==0) return -1; // in descending order
        
        int smaller = i, max = nc[i];
        for(int j=i+1; j<nc.length; j++){
            if(nc[j]>nc[i-1] && nc[j]<=max){
                smaller = j;
            }
        }
        // swap this two char
        char temp = nc[i-1];
        nc[i-1] = nc[smaller];
        nc[smaller] = temp;
        // order substring(i) to ascending order
        Arrays.sort(nc, i, nc.length);
        long l = Long.parseLong(new String(nc));
        return l>Integer.MAX_VALUE? -1: (int)l;
    }
}
