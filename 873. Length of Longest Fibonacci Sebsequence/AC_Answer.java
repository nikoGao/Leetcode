class Solution {
    public int lenLongestFibSubseq(int[] A) {
        // minimize the question to the theory of Fibonacci: (a, b) , if a+b in set, (a, b) => (b, a+b)
        Set<Integer> set = new HashSet<>();
        for(int a:A) set.add(a);
        if(A.length<3) return 0;
        int result = 0;
        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                int x1 = A[i], x2 = A[j], length = 2;
                while(set.contains(x1+x2)){
                    length++;
                    int temp = x2;
                    x2 += x1;
                    x1 = temp;
                }
                if(length==2) length=0;
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
