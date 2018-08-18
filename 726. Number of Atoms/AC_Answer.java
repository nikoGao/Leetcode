class Solution {
    // Like tree bfs
    public String countOfAtoms(String formula) {
        // to store each atoms' number
        Map<String, Integer> atoms = new HashMap<>();
        // to store each sub-formula's atoms' number
        Stack<Map<String, Integer>> stack = new Stack<>();
        int i=0, n = formula.length();
        while(i<n){
            char current = formula.charAt(i++);
            if(current=='('){
                // meet left paraentese, push current map
                stack.push(atoms);
                // restart a new map for the next inner formula
                atoms = new HashMap<>();
            }else if(current==')'){
                // prepare for pop the inner formula's atoms
                int count = 0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    count = count*10 + formula.charAt(i++)-'0';
                }
                
                if(count==0) count = 1;
                if(!stack.isEmpty()){
                    Map<String, Integer> copy = atoms;
                    atoms = stack.pop();
                    for(String s: copy.keySet()){
                        atoms.put(s, atoms.getOrDefault(s, 0) + copy.get(s)*count);
                    }
                }
            }else{
                // int the same level
                // need to steal with each atom's string
                // UpperCase represent the start of an atom, number / lowerCase represent end
                int start = i-1;
                while(i<n && Character.isLowerCase(formula.charAt(i))) i++;
                String atom = formula.substring(start, i);
                int count = 0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    count = count*10 + formula.charAt(i++)-'0';
                }
                
                if(count==0) count = 1;
                atoms.put(atom, atoms.getOrDefault(atom, 0) + count);
            }
        }
        // time to re-write it in the string formula
        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList<>(atoms.keySet());
        Collections.sort(keys);
        for(String k:keys){
            sb.append(k);
            if(atoms.get(k)>1) sb.append(atoms.get(k));
        }
        return sb.toString();
    }
}
