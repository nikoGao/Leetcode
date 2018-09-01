class Solution {
    
    private int diff = Integer.MAX_VALUE;
    
    public String nextClosestTime(String time) {
        // there are at most total 4^4 = 256 possible combinations, try everyone
        Set<Integer> set = new HashSet<>();
        // as all input is valid
        set.add(Integer.parseInt(time.substring(0,1)));
        set.add(Integer.parseInt(time.substring(1,2)));
        set.add(Integer.parseInt(time.substring(3,4)));
        set.add(Integer.parseInt(time.substring(4)));
        // if there is only one digit appear, no other possible combinations
        if(set.size()==1) return time;
        List<Integer> digits = new ArrayList(set);
        String result = "";
        
        int target = Integer.parseInt(time.substring(0,2)) * 60 + Integer.parseInt(time.substring(3));
        
        result = dfs(digits, "", 0, target);
        return result;
    }
    
    public String dfs(List<Integer> digits, String current, int pos, int target){
        String result = "";
        if(pos==4){
            // find all possible digits, next step is to find whether it's closest next time
            int time = Integer.parseInt(current.substring(0,2)) * 60 + Integer.parseInt(current.substring(2,4));
            if(time==target) return ""; // cannot be itself;
            int d = time>target? time-target: 1440 + time-target; // if smaller, treat it as next day's time
            if(d<diff){
                diff = d;
                result = current.substring(0,2) + ":" + current.substring(2);
            }
            return result;
        }
        
        for(Integer d:digits){
            if(pos==0 && d>3) continue; // the first one can only use 0, 1, 2
            if(pos==1 && (current.charAt(0)-'0')*10 + d>23) continue; // hours < 24
            if(pos==2 && d>5) continue; // the largest minutes is 59, cannot be bigger
            // if(pos==3 && (current.charAt(2)-'0')*10 + d>59) continue;
            String candidate = dfs(digits, current + Integer.toString(d), pos+1, target);
            if(!candidate.isEmpty()) result = candidate;
        }
        return result;
    }
}
