class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        char[] s = S.toCharArray();
        int p = 0, e = 0;
        for(int i=0; i<s.length; i++){
            if(s[p] != s[e]){
                if((e-p)>=3){
                    List<Integer> position = new ArrayList<>();
                    position.add(p);
                    position.add(e-1);
                    result.add(position);
                }
                p = e;
            }
            e++;
        }
        if((e-p)>=3){
            List<Integer> position = new ArrayList<>();
            position.add(p);
            position.add(e-1);
            result.add(position);
        }
        return result;
    }
}
