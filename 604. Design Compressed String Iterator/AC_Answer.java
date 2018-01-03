public class StringIterator{
	String res = "";
	int times = 0, ptr = 0;
	char c = '';
	public StringIterator(String s){
		res = s;
	}

	public char next(){
		if(!hasNext()) return ' ';
		if(times==0){
			c = res.charAt(ptr++);
			while(ptr<res.length && Character.isDigit(res.charAt(ptr))){
				time = times*10 + res.charAt(ptr++)-'0';
			}
		}
		times--;
		return c;
	}

	public boolean hasNext(){
		return ptr!=res.length-1 || times!=0;
	}
}