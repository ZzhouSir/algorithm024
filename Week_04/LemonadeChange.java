/**
 * 题目：柠檬水找零
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        // 贪心算法
        boolean isPay = false;
        if(bills.length > 0){
            int fiveBill = 0,tenBill = 0;
            int idx = 0;
            while (idx < bills.length){
                int clientPay = bills[idx];
                if(clientPay == 5){
                    fiveBill ++;
                } else if(clientPay == 10){
                    if(fiveBill > 0){
                        tenBill ++;
                        fiveBill --;
                    }else{
                        return false;
                    }
                } else if(clientPay == 20){
                    if(fiveBill >= 1 && tenBill >= 1){
                        fiveBill --;
                        tenBill --;
                    }else if(fiveBill >= 3){
                        fiveBill -= 3;
                    }else{
                        return false;
                    }
                }
                idx ++;
            }
            return true;
        }
        return isPay;
    }
}