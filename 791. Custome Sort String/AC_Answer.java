class Solution {
    public String customSortString(String S, String T) {
        if(T.isEmpty() || S.isEmpty()) return T;
        PriorityQueue<String[]> index = new PriorityQueue<>(new Comparator<String[]>(){
            public int compare(String[] a, String[] b){
                return Integer.parseInt(a[1])-Integer.parseInt(b[1]);
            }
        });
        
        for(int i=0; i<S.length(); i++){
            index.offer(new String[]{S.substring(i, i+1), Integer.toString(i)});
        }
        
        Map<Character, Integer> freq = new HashMap<>();
        for(char c:T.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        while(index.size()>0){
            String[] c = index.poll();
            int num = freq.containsKey(c[0].charAt(0))? freq.get(c[0].charAt(0)):0;
            while(num-->0) sb.append(c[0]);
            freq.remove(c[0].charAt(0));
        }
        for(char c:freq.keySet()){
            int num = freq.get(c);
            while(num-->0) sb.append(c);
        }
        
        return sb.toString();
    }
}
