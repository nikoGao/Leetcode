class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int an:answers){
            if(count.containsKey(an)){
                if(count.get(an)>0)
                    count.put(an, count.get(an)-1);
                else count.put(an, count.get(an) + an);
            }
            else{
                count.put(an, an);
            }
        }
        int result = 0;
        for(int i:count.values()) result += i;
        return result + answers.length;
    }
}
