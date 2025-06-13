package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    //In N*N chessboard , conditions-:
    /*every row and column should have 1 queen
     * no queen should attack each other
     * queen should not be present in diagonals
     */
    public boolean isSafe(int row,int col,char board[][]){
        //horizontal ie row
        for(int j=0;j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical ie column
        for(int i=0;i<board[0].length;i++){
            if (board[i][col] == 'Q') {
                return false; 
            }
        }
        /* DIAGONALS */
        //upper left---->[r-1][c-1]
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right--->[r-1][c+1]
         r=row;
        for(int c=col;c<board.length && r>=0;c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left----->[r+1][c-1]
         r=row;
        for(int c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right----->[r+1][c+1]
         r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public static void saveBoard(char board[][],List<List<String>> allBoards){
        String row="   ";
        List<String> newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="   ";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'Q')
                row += 'Q';
                else
                row += '.';
            }
            newboard.add(row);

        }
        allBoards.add(newboard);
    }
    public void helper(char board[][],List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]= 'Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';//remove to backtrack
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards=new ArrayList<>();
         char board[][]= new char[n][n];
         //initialize board wiht '.'
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
         }
         helper(board, allBoards, 0);
         return allBoards;
    }
    public static void main(String[] args) {
        NQueen q=new NQueen();
        List<List<String>> result=q.solveNQueens(4);
        for(List<String> board : result){
            for(String row : board){
                System.out.println(row  + "   ");
            }
            System.out.println();
        }
    }
}
