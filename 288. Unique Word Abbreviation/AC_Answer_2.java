class ValidWordAbbr {
    
    private HashMap<String, String> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for(String s:dictionary){
            String abbreviation = abbreviate(s);
            if(map.containsKey(abbreviation)){
                if(!map.get(abbreviation).equals(s)) map.put(abbreviation, "#");
            }else map.put(abbreviation, s);
        }
    }
    
    public boolean isUnique(String word) {
        String abbrev = abbreviate(word);
        return !map.containsKey(abbrev) || map.get(abbrev).equals(word);
    }
    
    public String abbreviate(String s){
        if(s.length()<=2) return s;
        return (s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1));
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
