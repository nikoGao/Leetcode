/**
The key is to find the number of factors of index i(k)
e.g k=6: 1,2,3,6(except 1), total 3 factors, end with off
Since all bulbs are on at the beginning, we can get:

If k is odd, the bulb will be off in the end.(after odd times of toggling).
If k is even, the bulb i will be on in the end (after even times of toggling).
As we all know, a natural number can divided by 1 and itself, and all factors appear in pairs.

When we know that p is i’s factor, we are sure q = i/p is also i’s factor.

If i has no factor p that makes p = i/p, k+ 1 is even.

If i has a factor p that makes p = i/p (i = p^2, i is a perfect square of p), k+ 1 is odd.

So we get that in the end:

If i is a perfect square , k+ 1 is odd, k is even (bulb i is on).
If i is NOT a perfect square , k+ 1 is even, k is odd (bulb i is off).

In all, the final question is to find the number of perfect square in n;
The number of perfect square numbers which are no more than n, is the square root of the maximum perfect square number which is NO MORE than n
**/

class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
