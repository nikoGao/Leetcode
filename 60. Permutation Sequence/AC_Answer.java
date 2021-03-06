class Solution {
    public String getPermutation(int n, int k) {
        int pos = 0;
        StringBuilder sb = new StringBuilder();
        List<Integer> indexes = new ArrayList<>();
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        
        for(int i=1; i<=n; i++) indexes.add(i);
        k--;
        
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n-i];
            sb.append(String.valueOf(indexes.get(index)));
            indexes.remove(index);
            k-=index*factorial[n-i];
        }
        return sb.toString();
    }
    
}
