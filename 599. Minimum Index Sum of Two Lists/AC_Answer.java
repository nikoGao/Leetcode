class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> common = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            if(Arrays.asList(list2).contains(list1[i]))
                map.put(list1[i], i);
        }
        int distance = list1.length+list2.length;
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                distance = Math.min(distance, Math.abs(map.get(list2[i])+i));
                map.put(list2[i], Math.abs(map.get(list2[i])+i));
            }
        }
        for(String s:map.keySet()){
            if(map.get(s)==distance) common.add(s);
        }
        return common.toArray(new String[common.size()]);
    }
}
