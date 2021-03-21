/**
 * 题目：爬楼梯
 */
public class ClimbStairs {
    static Map map = new HashMap<>();
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }else {
            int x,y;
            if((map.get(n-1) != null) &&(map.get(n-2) != null)){
                x = (int) map.get(n-1);
                y= (int) map.get(n-2);
            }else {
                x = climbStairs(n-1);
                y = climbStairs(n-2);
                map.put(n-1,x);
                map.put(n-2,y);
            }
            return x+y;
        }
    }
}
