/**
 * 题目：括号生成
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, n, n, "");
        return res;
    }

    private void dfs(List<String> res, int left, int right, String curStr) {
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
        if (left < 0)
            return;
        if (right < left)
            return;
        dfs(res, left - 1, right, curStr + "(");
        dfs(res, left, right - 1, curStr + ")");
    }
}