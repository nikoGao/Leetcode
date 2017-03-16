#我们使用双指针分别指向两个单词的开头，循环的条件是两个指针都没有到各自的末尾，如果指向缩写单词的指针指的是一个数字的话，如果当前数字是0，返回false，因为数字不能以0开头，然后我们要把该数字整体取出来，所以我们用一个while循环将数字整体取出来，然后指向原单词的指针也要对应的向后移动这么多位数。如果指向缩写单词的指针指的是一个字母的话，那么我们只要比两个指针指向的字母是否相同，不同则返回false，相同则两个指针均向后移动一位
class Solution(object):
    def validWordAbbreviation(self, word, abbr):
        size = len(word)
        cnt = loc = 0
        for w in abbr:
            if w.isdigit():
                if w == '0' and cnt == 0:
                    return False
                cnt = cnt * 10 + int(w)
            else:
                loc += cnt
                cnt = 0
                if loc >= size or word[loc] != w:
                    return False
                loc += 1
        return loc + cnt == size
