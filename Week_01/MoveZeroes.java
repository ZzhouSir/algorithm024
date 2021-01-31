/**
 * 题目：移动零
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length > 0){
            int j = 0;
            for(int i = 0; i < nums.length;i++){
                if(nums[i] != 0){
                    // int z = nums[j];
                    nums[j] = nums[i];
                    // nums[i] = z;
                    j++;
                }
            }
            if(j > 0){
                for(int i = j; i < nums.length;i++){
                    nums[i] = 0;
                }
            }
        }
    }
}