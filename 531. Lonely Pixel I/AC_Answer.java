// 2D array problem, notice to the edge
class Solution{
	public int findLonelyPixel(char[][] picture){
		int result = 0;
		int[] rows = new int[picture.length];
		if(rows==0) return result;
		int[] cols = new int[picture[0].length];
		for(int i=0; i<picture.length; i++){
			for(int j=0; j<picture[i].length; j++){
				if(picture[i][j] == 'B'){
					++rows[i];
					++cols[j];
				}
			}
		}
		for(int i=0; i<picture.length; i++){
			for(int j=0; j<picture[i].length; j++){
				if(picture[i][j] == 'B' && rows[i]==1 && cols[j]==1) ++result;
			}
		}
		return result;
	}

}
