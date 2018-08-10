class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Map<Integer, Set<String>> successors = new HashMap<>();
        int max = 0;
        for(String root:dict){
            int length = root.length();
            Set<String> set = successors.getOrDefault(length, new HashSet<>());
            set.add(root);
            successors.put(length, set);
            max = Math.max(max, length);
        }
        String[] ss = sentence.split(" ");
        for(int i=0; i<ss.length; i++){
            String s = ss[i];
            // System.out.println(ss[i]);
            int j = 1;
            while(j<s.length() && j<=max){
                if(successors.containsKey(j)){
                    String sub = s.substring(0, j);
                    if(successors.get(j).contains(sub)) break;
                }
                j++;
            }
            if(j<s.length() && j<=max){
                ss[i] = s.substring(0, j);
            }
        }
        return String.join(" ", ss);
    }
}
