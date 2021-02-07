/**
 * 题目：两数之和-2
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // 解法一：
//        int[] indexs = new int[2];
//        if (nums.length >= 2) {
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = 0; j < nums.length; j++) {
//                    if (i != j) {
//                        if (nums[i] + nums[j] == target) {
//                            indexs[0] = i;
//                            indexs[1] = j;
//                            return indexs;
//                        }
//                    }
//                }
//            }
//        }
        // 解法二：
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0;i< nums.length;i++){
            int subNum = target - nums[i];
            if(null != map.get(subNum)){
                return new int[]{map.get(subNum),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}