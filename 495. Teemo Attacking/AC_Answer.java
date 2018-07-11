class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int possible = timeSeries.length * duration;
        for(int i=1; i<timeSeries.length; i++){
            if(timeSeries[i] - timeSeries[i-1] < duration){
                possible -= (duration-(timeSeries[i]-timeSeries[i-1]));
            }
        }
        return possible;
    }
}
