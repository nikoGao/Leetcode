class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, List<Integer>> mapB = new HashMap<>();
        for(int i=0; i<B.length; i++){
            if(!mapB.containsKey(B[i])) mapB.put(B[i], new ArrayList<>());
            mapB.get(B[i]).add(i);
        }
        int[] index = new int[A.length];
        int indexed = 0;
        for(int i:A){
            index[indexed++] = mapB.get(i).get(0);
            mapB.get(i).remove(0);
        }
        return index;
    }
}

