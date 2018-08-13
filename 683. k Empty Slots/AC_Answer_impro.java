class Solution {
    public int kEmptySlots(int[] flowers, int k) {
        // not using set, and O(N) TIME
        int[] days = new int[flowers.length];
        // the position of flowers[i] will bloom at day i+1
        for(int i=0; i<flowers.length; i++) days[flowers[i]-1] = i + 1;
        int left = 0, right = k+1, result = Integer.MAX_VALUE;
        for(int i=0; right<days.length; i++){
            if(days[i]< days[left] || days[i]<=days[right]){
                if(i==right) result = Math.min(result, Math.max(days[left], days[right]));
                // not safisfy the conditions, can not include this day
                left = i;
                right = k + 1 + i;
            }
        }
        return result==Integer.MAX_VALUE? -1:result;
    }
}
