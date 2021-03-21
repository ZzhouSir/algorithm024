/**
 * 题目：数独
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rol = new int[9][10];
        int[][] col = new int[9][10];
        int[][] box = new int[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int num = board[i][j]-'0';
                if(rol[i][num]==1){
                    return false;
                }
                if(col[j][num]==1){
                    return false;
                }
                if(box[(i/3)*3+j/3][num]==1){
                    return false;
                }
                rol[i][num]=1;
                col[j][num]=1;
                box[(i/3)*3+j/3][num]=1;
            }
        }
        return true;
    }
}
