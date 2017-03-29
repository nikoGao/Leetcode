#Time Limited Exceed
class Solution(object):

    def groupAnagrams(self, strs):

        """

        :type strs: List[str]

        :rtype: List[List[str]]

        """

        map_dict = {}

        collection = []

        for string in strs:

            target = collections.Counter(string)

            if target not in collection:

                collection.append(target)

                map_dict[collection.index(target)] = [string]

            else:

                map_dict[collection.index(target)].append(string)

        res = [map_dict[i] for i in map_dict]

        return res
