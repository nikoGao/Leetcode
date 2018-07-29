class Solution{
	public int[] getModifiedArray(int length, int[][] updates){
		int[] result = new int[length];
		for(int i=0; i<updates.length; i++){
			int start = updates[0];
			int end = updates[1];
			int inc = updates[2];
			result[start] += inc;
			if(end+1<length) result[end+1] = -inc;
		}
		for(int i=1; i<length; i++){
			result[i] += result[i-1];
		}
		return result;
	}
}