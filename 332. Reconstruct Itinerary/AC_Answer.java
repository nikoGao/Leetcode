class Solution {
    public Map<String, PriorityQueue<String>> map = new HashMap<>();
    List<String> result = new LinkedList<>();
    public List<String> findItinerary(String[][] tickets) {
        for(String[] itinerary: tickets){
            String from = itinerary[0];
            String to = itinerary[1];
            if(!map.containsKey(from)){
                map.put(from, new PriorityQueue<>());
            }
            map.get(from).add(to);
        }
        visit("JFK");
        return result;
    }
    
    public void visit(String depart){
        while(map.containsKey(depart) && !map.get(depart).isEmpty()){
            visit(map.get(depart).poll());
        }
        result.add(0, depart);
    }
}
