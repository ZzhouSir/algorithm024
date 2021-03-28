/**
 * 题目：2的幂
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & -n) == n;
    }
}