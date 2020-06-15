package sudoku;

public class Board {

    public int[][] gameBoard;

    public static int[][] SUDOKU_MATRIX = {
            {9,0,0,1,0,0,0,0,5},
            {0,0,5,0,9,0,2,0,1},
            {8,0,0,0,4,0,0,0,0},
            {0,0,0,0,8,0,0,0,0},
            {0,0,0,7,0,0,0,0,0},
            {0,0,0,0,2,6,0,0,9},
            {2,0,0,3,0,0,0,0,6},
            {0,0,0,2,0,0,9,0,0},
            {0,0,1,9,0,4,5,7,0}
    };

    public Board() {
        this.gameBoard = SUDOKU_MATRIX;
    }

    public int[][] getSudokuMatrix() {
        return SUDOKU_MATRIX;
    }

}
