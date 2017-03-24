class Solution(object):

    def intToRoman(self, num):

        """

        :type num: int

        :rtype: str

        """

        map_dict = {1:'I', 5: 'V', 10: 'X', 50: 'L', 100: 'C', 500: 'D', 1000: 'M'}

        output = []

        while num:

            if num / 1000 != 0:

                times, num = divmod(num, 1000)

                output.append(map_dict[1000]*times)

            elif num / 100 != 0:

                times, num = divmod(num, 100)

                if times == 9:

                    output.append(map_dict[100] + map_dict[1000])

                elif times >= 5:

                    extra = times -5

                    output.append(map_dict[500] + map_dict[100] * extra)

                elif times == 4:

                    output.append(map_dict[100] + map_dict[500])

                else:

                    output.append(map_dict[100]*times)

            elif num / 10 != 0:

                times, num = divmod(num, 10)

                if times == 9:

                    output.append(map_dict[10] + map_dict[100])

                elif times >= 5:

                    extra = times -5

                    output.append(map_dict[50] + map_dict[10] * extra)

                elif times == 4:

                    output.append(map_dict[10] + map_dict[50])

                else:

                    output.append(map_dict[10]*times)

            else:

                if num == 9:

                    output.append(map_dict[1] + map_dict[10])

                elif num >= 5:

                    extra = num -5

                    output.append(map_dict[5] + map_dict[1] * extra)

                elif num == 4:

                    output.append(map_dict[1] + map_dict[5])

                else:

                    output.append(map_dict[1]*num)

                num = 0

        return ''.join(i for i in output)

                

        
