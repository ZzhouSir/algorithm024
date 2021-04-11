/**
 * 题目：仅仅反转字母
 */
public class ReverseOnlyLetters{
    public String reverseOnlyLetters(String S) {
        char[] chs = S.toCharArray();
        int p = 0;
        int q = chs.length - 1;
        while(p < q){
            while(p < q && !Character.isLetter(chs[p])){
                p++;
            }
            while(p < q && !Character.isLetter(chs[q])){
                q--;
            }
            char c = chs[p];
            chs[p] = chs[q];
            chs[q] = c;
            q--;
            p++;
        }
        S = new String(chs);
        return S;
    }
}