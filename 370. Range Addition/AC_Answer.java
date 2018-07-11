class Solution{
	public int[] getModifiedArray(int length, int[][] updates){
		// use first and last element, increase first element, decrease element.
		// then sum up all element, so that all subsequent will get the same increment till the last element
		// if meet the end point of a range, decrease the addition so that it'll not influence next range
		int[] result = new int[length];
		if(length==0) return result;
		for(int[] u:updates){
			result[u[0]] += u[2];
			if(u[1]+1<length) result[u[1]+1] -= u[2];
		}
		int sum = 0; // as initialize element equals to zero
		for(int i=0; i<length; i++){
			sum += result[i];
			result[i] = sum;
		}
		return result;
	}
}