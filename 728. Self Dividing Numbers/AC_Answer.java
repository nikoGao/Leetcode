class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for(int i=left; i<=right; i++){
            int j = i;
            while(j!=0){
                int res = j%10;
                if(res==0 || i%res!=0) break;
                j /= 10;
            }
            if(j==0) result.add(i);
        }
        return result;
    }
}
