/**
 * 题目：有效的字母异位词
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] ints = new int[26];
        // s全部存到哈希表中
        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            ints[t.charAt(i) - 'a']--;
            // 如果已经出现不一致的提前返回
            if(ints[t.charAt(i)-'a'] <0){
                return false;
            }
        }
        // 遍历哈希表，不为0表示不一致
        for (int anInt : ints) {
            if(anInt != 0){
                return false;
            }
        }
        return true;
    }
}