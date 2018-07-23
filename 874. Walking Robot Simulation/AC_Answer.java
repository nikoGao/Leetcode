class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        int direction = 0;
        int result = 0;
        // store each obstacle as string in a set, prepare for the check
        Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + " " + obs[1]);
        }
        // direction: N 0, E 1 or -3, S 2 or -2, W 3 or -1
        for(int c:commands){
            if(c==-1) direction++; 
            else if(c==-2) direction--;
            else{
                // move north, y++;
                if(direction % 4==0){
                    while(c-->0 &&!set.contains((x + " " + (y+1)))){
                        y++;
                    }
                }else if(direction %4 == 1 || direction%4 == -3){
                    // move east, x++
                    int origin = x;
                    while(c-->0 &&!set.contains(((x+1) + " " + y))){
                        x++;
                    }
                }else if(direction %4 == 2 || direction%4 == -2){
                    // move south, y--
                    int origin = y;
                    while(c-->0 &&!set.contains((x + " " + (y-1)))){
                        y--;
                    } 
                }else{
                    // move west, x--
                    int origin = x;
                    while(c-->0 &&!set.contains(((x-1) + " " + y))){
                        x--;
                    }
                }
                result = Math.max(result, x*x+y*y);
            }
        }
        return result;
    }
}
