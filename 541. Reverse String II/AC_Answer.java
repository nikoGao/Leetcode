class Solution {
    public String reverseStr(String s, int k) {
        String output = "";
        String sub;
        for(int i=0; i<s.length(); i=i+2*k){
            if(i+2*k<s.length())
                sub = s.substring(i, i+2*k);
            else sub = s.substring(i, s.length());
            if(sub.length()<k){
                output += new StringBuilder(sub).reverse().toString();
            }else{
                String[] arrays = sub.split("");
                for(int j=0; j<k/2; j++){
                    String temp = arrays[j];
                    arrays[j] = arrays[k-j-1];
                    arrays[k-j-1] = temp;
                }
                output += String.join("", arrays);;
            }
        }
        return output;
    }
}
