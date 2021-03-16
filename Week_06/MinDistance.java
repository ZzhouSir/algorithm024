/**
 * 题目：编辑距离
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1Array[i - 1] == word2Array[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                    continue;
                }
                int insert = dp[i][j - 1] + 1;
                int replace = dp[i - 1][j - 1] + 1;
                int delete = dp[i - 1][j] + 1;
                dp[i][j] = Math.min(Math.min(insert, replace), delete);

            }
        }
        return dp[len1][len2];
    }
}