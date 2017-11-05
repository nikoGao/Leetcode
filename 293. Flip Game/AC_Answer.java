public class Solution{
	public List<String> generatePossibleNextMove(String s){
		List<String> res = new ArrayList<String>();
		char[] arr = s.toCharArray();
		for(int i = 0; i< s.length-1; i++){
			if(arr[i+1]==a[i] && arr[i]=='+'){
				arr[i]='-';
				arr[i+1]='-';
				res.add(new String(arr));
				arr[i]='+';
				arr[i+1]='+';
			}
		}
		return res;
	}
}
