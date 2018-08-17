class Solution {
    String[] number = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] decimal = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "");         // as num<1,000
        map.put(1, "Thousand"); // as 10^3
        map.put(2, "Million");  // as 10^6
        map.put(3, "Billion");  // as 10^9
        String result = "";
        int tens = 0;
        while(num>0){
            // process three decimal at one time
            if(num%1000!=0) result = helper(num%1000) + map.get(tens) + " " + result;
            num /= 1000;
            tens++;
        }
        return result.trim(); // remove the last space
    }
    public String helper(int num){
        /** three situation: number<20, return number[i]
        number>20 && number<100, return decimal[num/10] + helper(num%10) which will call itself an return as num<20
        number>100, then the number will start with 1-9 + hundred + the rest, which can call itself
        */
        if(num==0) return "";
        else if(num<20) return number[num] + " ";
        else if(num<100) return decimal[num/10] + " " + helper(num%10);
        else return number[num/100] + " Hundred " + helper(num%100);
    }
}
