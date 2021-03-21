/**
 * 题目：最小基因变化
 */
public class MinMutation {
    public int minMutation(String start, String end, String[] bank) {
        char[][] banks = new char[bank.length][8];
        for (int i = 0; i < bank.length; i++) {
            banks[i] = bank[i].toCharArray();
        }
        solution1(start.toCharArray(), end.toCharArray(), banks, 0);
        return minChange == Integer.MAX_VALUE ? -1 : minChange;
    }

    int minChange = Integer.MAX_VALUE;
    private void solution1(char[] start, char[] end, char[][] bank, int change) {
        if (Arrays.equals(start, end)) {
            minChange = Math.min(minChange, change);
            return;
        }

        for (int j = 0; j < bank.length; j++) {
            char[] piece = bank[j];
            if (piece == null) continue;
            int diff = 0;
            for (int i = 0; i < start.length; i++) {
                if (start[i] != piece[i]) diff++;
            }
            if (diff == 1) {
                bank[j] = null;
                solution1(piece, end, bank, change + 1);
                bank[j] = piece; // 还原回溯
            }
        }
    }
}