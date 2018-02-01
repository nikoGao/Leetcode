class Solution {
    //Gray(i) = i ^ (i/2)
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<=(int)Math.pow(2,n)-1; i++){
            res.add(i^(i/2));
        }
        return res;
    }
}
