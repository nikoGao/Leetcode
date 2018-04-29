class Solution {
    public String toGoatLatin(String S) {
        String[] sa = S.split(" ");
        List<String> res = new ArrayList<>();
        for(int i=0; i<sa.length; i++){
            String ns = "";
            String ls = sa[i].toLowerCase();
            if(ls.startsWith("a")||ls.startsWith("e")||ls.startsWith("i")
               ||ls.startsWith("o")||ls.startsWith("u")){
                ns += sa[i] + "ma";
            }else{
                ns += sa[i].substring(1) + sa[i].substring(0,1) + "ma";
            }
            int j =i+1;
            while(j>0){
                ns += "a";
                j--;
            }
            res.add(ns);
        }
        String result = String.join(" ", res);
        return result;
    }
}
