class Solution {
    public String complexNumberMultiply(String a, String b) {
        int real = 0, virtual = 0;
        int[] anum = split(a);
        int[] bnum = split(b);
        real = anum[0]*bnum[0] + -1 * anum[1] * bnum[1];
        virtual = anum[0] * bnum[1] + anum[1] * bnum[0];
        String result = Integer.toString(real) + "+" +Integer.toString(virtual) + "i";
        return result;
    }
    
    public int[] split(String s){
        int[] separator = new int[2];
        int j=0;
        while(j<s.length()){
            if(j>0 && s.charAt(j)=='+') break;
            j++;
        }
        separator[0] = Integer.parseInt(s.substring(0, j));
        separator[1] = Integer.parseInt(s.substring(j+1, s.length()-1));
        return separator;
    }
}
