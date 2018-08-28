class Solution {
    public String similarRGB(String color) {
        StringBuilder sb = new StringBuilder();
        String result = "#";
        for(int i=1; i<color.length(); i+=2){
            String c = color.substring(i, i+2);
            result += findSimilar(c);
        }
        return result;
    }
    
    public String findSimilar(String color){
        int h = Integer.parseInt(color, 16); // turn to integer
        h = h/17 + (h%17>8?1:0);
        return String.format("%02x", h*17);
    }
}
