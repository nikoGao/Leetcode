public class Solution{
	public String similarRGB(String color){
		String[] colors = {"00", "11", "22", "33", "44", "55", "66", "77", "88", "99", "aa", "bb", "cc", "dd", "ee", "ff"};
		String r = color.substring(0, 2), g = color.substring(2, 4), b = color.substring(4);
		String res = "#" + closest(r, colors) + closest(g, colors) + closest(b, colors);
		return res;
	}

	public String closest(String c, String[] l){
		String start = c.substring(0,1) + c.substring(0,1);
		int index = Arrays.asList(l).indexOf(start);
		int next = (index == l.length) ? index-1 : index+1;
		int value1 = Math.pow(Integer.parseInt(c, 16)-Integer.parseInt(l[next], 16), 2);
		int value2 = Math.pow(Integer.parseInt(c, 16)-Integer.parseInt(l[index], 16), 2);
		return (value1 < value2)? l[next]:l[index];
	}
}