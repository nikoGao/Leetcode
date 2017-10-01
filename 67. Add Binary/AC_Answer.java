# Use BigInteger, toString
# Run time 10ms
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger result = num1.add(num2);
        return result.toString(2);
    }
}
