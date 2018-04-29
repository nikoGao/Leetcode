class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String result = "";
        int occurrace = 0;
        Map<String, Integer> map = new HashMap<>();
        String[] a = paragraph.split("[\\.,!?;'\\s]+\\s*");
        for(String s:a){
            String s1 = s.toLowerCase();
            if(Arrays.asList(banned).contains(s1)){
                continue;
            }else{
                if(!map.containsKey(s1)) map.put(s1, 0);
                map.put(s1, map.get(s1)+1);
                if(map.get(s1)>occurrace){
                    occurrace = map.get(s1);
                    result = s1;
                }
            }
        }
        return result;
    }
}
