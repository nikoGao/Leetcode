class Solution {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;
        for(int i=0; i<moves.length(); i++){
            char s = moves.charAt(i);
            if(s=='L') x--;
            else if(s=='R') x++;
            else if(s=='U') y++;
            else if(s=='D') y--;
        }
        return x==0 && y==0;
    }
}
