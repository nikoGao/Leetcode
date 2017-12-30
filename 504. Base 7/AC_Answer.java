class Solution {
    public String convertToBase7(int num) {
        String res = "";
        if(num==0) return new Integer(num).toString();
        boolean symbol = true;
        if(num<0) symbol = false;
        num = Math.abs(num);
        while(num != 0){
            int rest = num%7;
            res += rest;
            num = num/7;
        }
        if(!symbol) return "-" + new StringBuilder(res).reverse().toString();
        return new StringBuilder(res).reverse().toString();
    }
}
