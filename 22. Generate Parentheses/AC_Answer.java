class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0, "", 0, n);
        return result;
    }
    
    public void generate(int n, String prev, int m, int length){
        if(prev.length()==2*length){
            result.add(prev);
            return;
        }
        if(n<length)
            generate(n+1, prev+"(", m, length);
        if(m<n)
            generate(n, prev+")", m+1, length);
    }
}
