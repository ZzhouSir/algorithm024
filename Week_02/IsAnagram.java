import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目：有效的字母异位词
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            // 解法一：
//            if(s.length() == 0){
//                return true;
//            }
//            char[] sCharList = s.toCharArray();
//            char[] tCharList = t.toCharArray();
//            Arrays.sort(sCharList);
//            Arrays.sort(tCharList);
//            return Arrays.equals(sCharList,tCharList);
            // 解法二：
            Map<String, Integer> strCountMap = new HashMap<>(26);
            for (int i = 0; i < s.length(); i++) {
                strCountMap.put(String.valueOf(s.charAt(i)), strCountMap.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
            }
            for (int j = 0; j < t.length(); j++) {
                if (null != strCountMap.get(String.valueOf(t.charAt(j)))) {
                    strCountMap.put(String.valueOf(t.charAt(j)), strCountMap.getOrDefault(String.valueOf(t.charAt(j)), 0) - 1);
                }
            }
            int noAnagramCount = 0;
            for (int z = 0; z < s.length(); z++) {
                if (strCountMap.get(String.valueOf(s.charAt(z))) != 0) {
                    noAnagramCount += 1;
                }
            }
            return noAnagramCount == 0;
        }
        return false;
    }
}
