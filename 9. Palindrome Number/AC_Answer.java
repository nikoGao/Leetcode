Class Solution{
	public boolean isPalindrome(int x){
		if ((x<0) ||(x%10==0)) return false;
		int rev = 0;
		while(x > rev){
			rev = rev*10 + x%10;
			x /= 10;
		}
		return (x==rev||x==rev/10);  //if the length of x is even, then x==rev; otherwise, rev is one length longer than x.
	}
}