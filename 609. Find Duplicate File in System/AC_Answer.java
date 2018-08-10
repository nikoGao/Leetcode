class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contents = new HashMap<>();
        for(String file:paths){
            String[] path = file.split(" ");
            String root = path[0];
            for(int i=1; i<path.length; i++){
                String name = path[i];
                String[] content = name.split("[\\(\\)]");
                String full = root + "/" + content[0];
                if(!contents.containsKey(content[1])) contents.put(content[1], new ArrayList<>());
                contents.get(content[1]).add(full);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s:contents.keySet()){
            if(contents.get(s).size()<2) continue;
            result.add(contents.get(s));
        }
        return result;
    }
}
