class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for(String cp: cpdomains){
            findcps(cp, map);
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            String new_cp = Integer.toString(entry.getValue()) + " " + entry.getKey();
            result.add(new_cp);
        }
        return result;
    }
    
    public void findcps(String cp, Map<String, Integer> map){
        String[] s1 = cp.split(" ");
        String[] s2 = s1[1].split("\\.");
        int occ = Integer.valueOf(s1[0]);
        int i = 0, j = 0;
        while(j<s2.length){
            String s = s1[1].substring(i);
            if(map.containsKey(s)){
                map.put(s, map.get(s)+occ);
            }else{
                map.put(s, occ);
            }
            i += s2[j].length() + 1;
            j++;
        }
    }
}
