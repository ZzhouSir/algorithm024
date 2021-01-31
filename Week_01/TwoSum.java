/**
 * 题目：两数之和
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if(i != j){
                        if(nums[i] + nums[j] == target){
                            indexs[0] = i;
                            indexs[1] = j;
                            return indexs;
                        }
                    }
                }
            }
        }
        return indexs;
    }
}