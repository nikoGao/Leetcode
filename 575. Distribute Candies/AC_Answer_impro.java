class Solution {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> cataloges = new HashMap<>();
        for(int candie:candies) cataloges.put(candie, cataloges.getOrDefault(candie, 0)+1);
        int types = cataloges.size();
        // at most all types
        return Math.min(types, candies.length/2);
    }
}
