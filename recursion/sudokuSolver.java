package recursion;
public class sudokuSolver {
    /* 1-9 once in row, column and grid(3*3) */
    public boolean isSafe(char board[][],int row,int col,int num){//check for validity
        for(int i=0;i<board.length;i++){
            //check row
            if(board[i][col] == (char)(num+'0')){
                return false;
            }
            //check col
            if(board[row][i] == (char)(num+'0')){
                return false;
            }
        }
        //check grid 3x3
        //calculate starting point of each grid
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j] == (char)(num+'0')){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean helper(char board[][],int row,int col){
        if(row == board.length){
            return true;
        }

        int nrow=0;
        int ncol=0;
        if(col != board.length-1){
            nrow=row;//traverse row till end of col
            ncol=col+1;
        }
        else{
            nrow=row+1;//when col ends, move to next row and starting col
            ncol=0;
        }
        if(board[row][col] != '.'){//if cell is not empty
            if (helper(board, nrow, ncol)){
                return true;
            }
        }
        else{//if cell is empty fill num b/w 1-9
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');//typecast int to char
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;

    }
    public void solveSudoku(char board[][]){
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        sudokuSolver solver = new sudokuSolver();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        solver.solveSudoku(board);
        
        // Print the solved Sudoku board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
