/**
 * 题目：位1的个数
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) count ++; // 判断最低位是否是 1，是则计数器 +1
            n >>>= 1; // 舍弃最低位，继续判断下一位（会有负数情况，因此应该使用无符号右移）
        }
        return count;
    }
}