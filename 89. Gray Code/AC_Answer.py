# Run time 48ms(71.72%)
#此方法从对应的n位二进制码字中直接得到n位格雷码码字，步骤如下：
#1. 对n位二进制的码字，从右到左，以0到n-1编号
#2. 如果二进制码字的第i位和i+1位相同，则对应的格雷码的第i位为0，否则为1（当i+1=n时，二进制码字的第n位被认为是0，即第n-1位不变）
#[3]公式表示：  （G：格雷码，B：二进制码）

class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        res = []
        for i in range(2**n):
            grayCode = (i>>1)^i
            res.append(grayCode)
        return res
