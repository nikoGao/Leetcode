class Solution{
	public int findBlackPixel(char[][] picture, int N){
		if(picture.length==0 || picture[0].length==0) return 0;
		int m = picture.length, n = picture[0].length;
		int[] cols = new int[m];
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<m; i++){
			int count = 0;
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<n; j++){
				if(picture[i][j]=='B'){
					cols[j]++;
					count++;
				}
				sb.add(picture[i][j]);
			}
			if(count==N){
				map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
			}
		}
		int result = 0;
		for(String s:map.keys()){
			if(map.get(s)==N){
				for(int j=0; j<n; j++){
					if(s.charAt(j)=='B' && cols[j]==N) result += cols[j];
				}
			}
		}
		return result;
	}
}