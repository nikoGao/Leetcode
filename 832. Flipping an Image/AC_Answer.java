class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a:A){
            int s=0, e=a.length-1;
            while(s<=e){
                int temp = a[s];
                if(s==e){
                    a[s] = 1-a[s];
                }else{
                    a[s] = 1-a[e];
                    a[e] = 1-temp;
                }
                s++;
                e--;
            }
        }
        return A;
    }
}
