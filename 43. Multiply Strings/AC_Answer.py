#大数乘法。算法的关键是要先将两个字符串翻转过来，然后按位进行相乘，相乘后的数不要着急进位，而是存储在一个数组里面，然后将数组中的数对10进行求余（%），就是这一位的数，然后除以10，即/10，就是进位的数。注意最后要将相乘后的字符串前面的0去掉。

class Solution(object):

    def multiply(self, num1, num2):

        """

        :type num1: str

        :type num2: str

        :rtype: str

        """

        num1 = num1[: : -1]; num2 = num2[::-1]

        arr = [0 for i in range(len(num1) + len(num2))]

        for i in range(len(num1)):

            for j in range(len(num2)):

                arr[i+j] += int(num1[i]) * int(num2[j])

        

        ans = []

        for i in range(len(arr)):

            digit = arr[i] % 10

            carr = arr[i] / 10

            if i < len(arr)-1:

                arr[i+1] += carr

            ans.insert(0, str(digit))

        while ans[0] == '0' and len(ans) > 1:

            del ans[0]

        return ''.join(i for i in ans)
