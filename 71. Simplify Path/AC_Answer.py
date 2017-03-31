# Time : 59ms
# '.' = previous directory, '..'= parent of previous directory

class Solution(object):

    def simplifyPath(self, path):

        """

        :type path: str

        :rtype: str

        """

        res = ['/']

        pathlist = path.split('/')

        for i in pathlist:

            if i == '' or i == '.':

                continue

            elif i == '..':

                if res != []:

                    res.pop()

                else:

                    res.append('/')

            else:

                res.append(i)

        if res == []:

            return '/'

        elif res[0] != '/':

            res.insert(0, '/')

        if len(res) <= 2:

            return ''.join(i for i in res)

        else:

            return ('/' + ''.join(res[i]+'/' for i in range(1, len(res)))).rstrip('/')

        

            
