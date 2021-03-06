// Count the bit of hour and minutes, should equal to the given num

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        for(int h = 0; h<12; h++){
            for(int m = 0; m<60; m++){
                if(Integer.bitCount(h*64+m)==num)
                    res.add(String.format("%d:%02d", h, m));
            }
        }
        return res;
    }
}
