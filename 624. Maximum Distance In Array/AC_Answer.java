public class Solution{
	public int maxDistance(int[][] list) {
		int res = 0, min = list[0][0], max=list[0][list[0].length-1];
		for(int[] sublist:list){
			res = Math.max(res, Math.max(sublist[sublist.length-1]-min, max-sublist[0]));
			min = Math.min(min, sublist[0]);
			max = Math.max(max, sublist[sublist.length-1]);
		}
		return res;
	}
}