class Solution {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<ss.length; i++){
            char c = Character.toLowerCase(ss[i]);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                dq.add(i);
            }
        }
        while(dq.size()>1){
            int front = dq.pollFirst();
            int end = dq.pollLast();
            char temp = ss[front];
            ss[front] = ss[end];
            ss[end] = temp;
        }
        return new String(ss);
    }
}
