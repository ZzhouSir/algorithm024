/**
 * 题目：省份数量
 */
public class FindCircleNum{
    public void dfs(int[][] M, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && M[j][j] == 1) {
                M[j][j] = 0;
                dfs(M, j);
            }
        }
    }
    public int findCircleNum(int[][] M) {
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (M[i][i] == 1) {
                dfs(M, i);
                count++;
            }
        }
        return count;
    }
}