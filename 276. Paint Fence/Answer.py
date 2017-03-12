#S(n)--当前杆和前一个杆颜色相同的涂色个数，D(n)表示当前杆和前一个颜色不相同的涂色个数
#S(n) = D(n-1),即若当前杆和前一个杆颜色相同的个数等于前一个杆颜色不相同的个数
#D(n) = (k-1)*(D(n-1)+S(n-1)), 即前一个杆和再前一个杆所有可能的颜色组合，乘以当前杆与前一个杆颜色不相同的个数
class Solution(object):
    def newWays(self. n, k):
        """
	:type n:int
	:type k:int
	:rtype:int
	"""
	if n == 0 or k == 0:
	    return 0
	if n == 1:
	    return k

	d, s = [0] * n, [0] * n
	d[0] = 0
	d[1] = k*(k-1)
	s[0] = k
	s[1] = k
	for i in range(2, n):
	    s[i] = d[i-1]
	    d[i] = (k-1)(s[i-1] + d[i-1])
	return s[n-1] + d[n-1]
