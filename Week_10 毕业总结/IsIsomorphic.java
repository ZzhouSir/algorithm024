/**
 * 题目：同构字符串
 */
public class IsIsomorphic{
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i = 0;i < s.length();i++) {
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i),t.charAt(i));
            }else {
                if(map.get(s.charAt(i)) == null) return false;
                else if(map.get(s.charAt(i)) == t.charAt(i)) continue;
                return false;
            }
        }
        return true;
    }
}