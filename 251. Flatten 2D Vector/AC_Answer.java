public class Vector2D{
	private List<List<Integer>> vec2d;
	private int row;
	private int col;
	private int numRows;
	public Vector2D(List<List<Integer>> vec2d){
		this.vec2d = vec2d;
		row = 0;
		col = 0;
		numRows = vec2d.size();
	}

	public int next(){
		int ans = 0;
		if(col < vec2d.get(row).size()) ans = vec2d.get(row.get(col);
		col++;
		if(col==vec2d.get(row).size()){
			col = 0;
			row++;
		}
		return ans;
	}

	public boolean hasNext(){
		if(row<numRows || (this.vec2d.get(row)==null || this.vec2d.get(row).isEmpty())) row++;
		return this.vec2d!=null && !vec2d.isEmpty() && row<numRows;
	}
}