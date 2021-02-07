import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 题目：字母异位词分组
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 解法一：
        if (strs.length > 0) {
            Map<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                char[] strChar = str.toCharArray();
                Arrays.sort(strChar);
                String realStr = String.valueOf(strChar);
                List<String> strGroup = map.get(realStr);
                if (null == strGroup) {
                    strGroup = new ArrayList<>();
                }
                strGroup.add(str);
                map.put(realStr, strGroup);
            }
            return new ArrayList<>(map.values());
        }
        return Collections.emptyList();
    }
}