class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int kinds = 0;
        if(candies.length>0) kinds++;
        for(int i=1; i<candies.length; i++){
            if(candies[i] != candies[i-1]) kinds++;
        }
        if(candies.length/2>=kinds) return kinds;
        else return candies.length/2;
    }
}
