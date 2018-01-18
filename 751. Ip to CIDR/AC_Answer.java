class Solution{
	public List<String> ipToCIDR(String ipString, int range) {
		String[] array = ipString.split("\\.");
		int ip = 0;
		for(int i=0; i<4; i++){
			ip += Integer.parseInt(array[i]) * (1<<8*(3-i));
		}
		List<String> cidrBlocks = new ArrayList<>();
		while(range>0){
			long step = ip & -ip;
			while(step>range) step /=2;
			cidrBlocks.add(longtoString(ip, (int)step));
			x += step;
			range -= step;
		}
		return cidrBlocks;
	}

	public String longtoString(int ip, int step){
		int[] ans = new int[4];
		for(int i=0; i<4; i++){
			ans[i] = (int)(x & 255);
			x >>= 8;
		}
		int len = 33;
		while(step>0){
			len--;
			step /= 2;
		}
		return ans[0] + "." + ans[1] + "." + ans[2] + "." + ans[3] + "/" + len;
	}
}