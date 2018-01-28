class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        List<String> lists = new ArrayList<>();
        lists.add("");
        lists.add("..");
        lists.add(".");
        List<String> stack = new LinkedList<>();
        for(String dir:dirs){
            if(dir.equals("..") && !stack.isEmpty()) stack.remove(stack.size()-1);
            else if(!lists.contains(dir)) stack.add(dir);
        }
        
        String res = "";
        for(int i=0; i<stack.size(); i++){
            res = res + "/" + stack.get(i);
        }
        return res==""?"/" : res;
    }
}
