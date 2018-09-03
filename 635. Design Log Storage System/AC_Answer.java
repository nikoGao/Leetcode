class LogSystem {
    
    private Map<String, Integer> grad = new HashMap<>();
    private Map<Integer, String> logs;

    public LogSystem() {
        grad.put("Year", 4);
        grad.put("Month", 7);
        grad.put("Day", 10);
        grad.put("Hour",13);
        grad.put("Minute", 16);
        grad.put("Second", 19);
        logs = new HashMap<>();
    }
    
    public void put(int id, String timestamp) {
        logs.put(id, timestamp);
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {
        List<Integer> result = new ArrayList<>();
        int length = grad.get(gra);
        String substart = s.substring(0, length);
        String subend = e.substring(0, length);
        for(Map.Entry<Integer, String> entry:logs.entrySet()){
            String sub = entry.getValue().substring(0, length);
            if(sub.compareTo(substart)>=0 && sub.compareTo(subend)<=0) result.add(entry.getKey());
        }
        return result;
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */
