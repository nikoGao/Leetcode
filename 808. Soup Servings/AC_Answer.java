class Solution {
    private double[][] record = new double[200][200];
    public double soupServings(int N) {
        // add 24 to N in which case, N<25
        return N>=4800? 1.0 : compute((N+24)/25, (N+24)/25);
    }
    
    public double compute(int a, int b){
        if(a<=0 && b<=0) return 0.5;
        if(b<=0 && a>0) return 0.0;
        if(a<=0 && b>0) return 1.0;
        if(record[a][b]>0) return record[a][b]; // already calculated once
        else{
            record[a][b] = 0.25 * (compute(a-4, b) + compute(a-3, b-1) + compute(a-2, b-2) + compute(a-1, b-3));
            return record[a][b];
        }
    }
}
