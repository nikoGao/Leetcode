class ValidWordAbbr {
    
    private HashMap<String, Integer> map;
    private HashSet<String> dict;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        dict = new HashSet<>();
        for(String s:dictionary){
            String abbreviation = abbreviate(s);
            if(dict.add(s)) map.put(abbreviation, map.getOrDefault(abbreviation, 0)+1);
        }
    }
    
    public boolean isUnique(String word) {
        String abbrev = abbreviate(word);
        if(dict.contains(word)) return map.get(abbrev)==1;
        else return !map.containsKey(abbrev);
    }
    
    public String abbreviate(String s){
        if(s.length()<=2) return s;
        String abbreviation = "";
        abbreviation += (s.substring(0, 1) + (s.length()-2) + s.substring(s.length()-1));
        // System.out.println(abbreviation);
        return abbreviation;
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
