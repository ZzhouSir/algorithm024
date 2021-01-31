/**
 * 题目：加一
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean isNeedPlus = true;
        for (int i = length - 1; i >= 0; i--) {
            int oldVal = digits[i];
            if (isNeedPlus) {
                digits[i] = digits[i] + 1;
            }
            digits[i] = digits[i] % 10;
            isNeedPlus = (digits[i] == 0 && oldVal == 9);
        }
        if (isNeedPlus) {
            int[] newDigits = new int[digits.length + 1];
            for (int j = 0; j < newDigits.length; j++) {
                if(j == 0){
                    newDigits[0] = 1;
                }else {
                    newDigits[j] = digits[j - 1];
                }
            }
            return newDigits;
        }
        return digits;
    }
}