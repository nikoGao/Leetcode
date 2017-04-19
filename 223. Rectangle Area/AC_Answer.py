# Common mathematics problem

class Solution(object):

    def computeArea(self, A, B, C, D, E, F, G, H):

        """

        :type A: int

        :type B: int

        :type C: int

        :type D: int

        :type E: int

        :type F: int

        :type G: int

        :type H: int

        :rtype: int

        """

        width1, width2 = C-A, G-E

        height1, height2 = D-B, H-F

        area1 = width1*height1

        area2 = width2*height2

        cover = max(min(C, G)-max(A, E), 0) * max(min(D, H)-max(B, F), 0)

        return area1 + area2 - cover
