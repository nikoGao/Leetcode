class Solution{
	public boolean isOneEditDistance(String str1, String str2){
		if(Math.abs(str1.length()-str2.length())>1) return false;
		else if (str1.length()==str2.length()){
			int i = 0;
			while(i<str1.length()){
				if(str1.charAt(i) != str2.charAt(i)){
					String sub1 = str1.substring(i+1);
					String sub2 = str2.substring(i+1);
					return sub1.equals(sub2);
				}
			}
		}else{
			String longer="", shorter="";
			if(str1.length().str2.length()){
				longer = str1;
				shorter = str2;
			}else{
				longer = str2;
				shorter = str1;
			}
			int i=0;
			while(i<shorter.length()){
				if(shorter.charAt(i) != longer.charAt(i)){
					break;
				}
			}
			return longer.substring(i+1).equals(shorter.substring(i));
		}
	}
}