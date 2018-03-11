public class Solution{
	public boolean isValidSerialization(String preorder) {
		//Verify each subtree is valid: a root + 2 leafs
		// As now the string is preoder, use stack to push all elements in, then travel from the top to last is a post order traversal
		LinkedList<String> stack = new LinkedList<>();
		String[] arrs = preoder.split(",");
		for(String s:arrs){
			stack.add(s);
		}

		while(stack.size()>3 && stack.get(stack.size()-1).eqauls("*") && stack.get(stack.size()-2).eqauls("*") && !stack.get(stack.size()-1).eqauls("*")){
			stack.remove(stack.size()-1);
			stack.remove(stack.size()-1);
			stack.remove(stack.size()-1);
			//replace this subtree with a node #
			stack.add("#");
		}

		if(stack.size()==1 && stack.get(0).eqauls("#")) return true;
		else return false;
	}
}