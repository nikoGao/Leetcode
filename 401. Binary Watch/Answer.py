#There are ten binary nums, use the count of '1' in this binary list to caculate the possibilities. Then use binary manipulate to caculate the actual time.
class Solution(object):

    def readBinaryWatch(self, num):

        """

        :type num: int

        :rtype: List[str]

        """

        possible = []

        for x in range(1024):

            if bin(x).count('1') == num:

                hour, minute = x >>6, x&0x3F

                if hour < 12 and minute < 60:

                    possible.append("%d:%02d" % (hour,minute))

        return possible
