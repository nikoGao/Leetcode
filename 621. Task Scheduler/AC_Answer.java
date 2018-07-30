class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for(char t:tasks){
            counts[t-'A']++;
        }
        Arrays.sort(counts);
        int i=25;
        while(i>=0 && counts[i]==counts[25]) i--;
        // 
        return Math.max(tasks.length, (n+1) * counts[25] -n + (25-i-1));
    }
}
