/**
 * 题目：字符串中的第一个唯一字符
 */
public class FirstUniqChar{
    public int firstUniqChar(String s) {
        if(s==null){
            return -1;
        }
        int[] chars=new int[26];

        char[] array = s.toCharArray();
        for (char c : array) {
            chars[c-97]++;
        }
        for (int i=0;i<array.length;i++){
            if(chars[array[i]-97]==1){
                return i;
            }
        }
        return -1;
    }
}