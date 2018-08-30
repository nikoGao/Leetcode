class Solution {
    public int findMinDifference(List<String> timePoints) {
        // just change all string to integer as hout*60 + minutes
        List<Integer> p = new ArrayList<>();
        for(String time:timePoints){
            String[] hm = time.split(":");
            int h = Integer.parseInt(hm[0]);
            int m = Integer.parseInt(hm[1]);
            p.add(h*60 + m);
            if(h<12){
                p.add((h+24)*60+m);
            }
        }
        int diff = Integer.MAX_VALUE;
        Collections.sort(p);
        for(int i=1; i<p.size(); i++){
            diff = Math.min(p.get(i)-p.get(i-1), diff);
        }
        return diff;
    }
}
