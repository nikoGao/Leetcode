class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] result = new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1; j>=0; j--){
                int multiply = (num1.charAt(i)-'0') * (num2.charAt(j) - '0');
                multiply += result[i+j+1];
                result[i+j+1] = multiply%10;
                result[i+j] += multiply/10;
            }
        }
        String res = "";
        for(int i: result){
            if(!(res.length()==0 && i==0))
                res += new Integer(i).toString();
        }
        return res.length()==0?"0":res;
    }
}
