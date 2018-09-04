class Solution {
    public String reorganizeString(String S) {
        // first, find all frequency for each char
        int[] freq = new int[26];
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return b[0]-a[0];
            }
        });
        for(char c:S.toCharArray()) freq[c-'a']++;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>(S.length()+1)/2) return "";
            if(freq[i]>0){
                pq.offer(new int[]{freq[i], i});
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(pq.size()>=2){
            int[] num1 = pq.remove();
            int[] num2 = pq.remove();
            char c1 = (char)(num1[1]+'a');
            char c2 = (char)(num2[1]+'a');
            sb.append(c1);
            sb.append(c2);
            if(--num1[0]>0) pq.offer(num1);
            if(--num2[0]>0) pq.offer(num2);
        }
        
        if(pq.size()==1) sb.append((char)(pq.remove()[1]+'a'));
        return sb.toString();
    }
}
