// 2D array problem, notice to the edge
class Solution{
	public int findLonelyPixel(char[][] picture){
		int result = 0;
		for(int i=0; i<picture.length; i++){
			for(int j=0; j<picture[i].length; j++){
				if(picture[i][j] == 'B' && check(picture, i, j)){
					result++;
				}
			}
		}
		return result;
	}

	public boolean check(char[][] picture, int row, int col){
		// check if a block is lonely
		boolean lonely = true;
		if(row>0) lonely &= (picture[row-1][col]!='B');
		if(row<picture[row].length-1) lonely &= (picture[row+1][col]!='B');
		if(col>0) lonely &= (picture[row][col-1]!='B');
		if(col<picture.length-1) lonely &= (picture[row][col+1]!='B');
		return lonely;
	}
}