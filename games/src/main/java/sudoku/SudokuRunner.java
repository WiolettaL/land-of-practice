package sudoku;

public class SudokuRunner {
    public static void main(String[] args) {

        System.out.println("Let's start the game!");

        Board board = new Board();
        SingleGame sudoku = new SingleGame(board.getSudokuMatrix());
        sudoku.display();


        if (sudoku.resolveSudoku()) {
            System.out.println("Game has been solved!");
            sudoku.display();
        } else {
            System.out.println("Sorry, can not solve this game.");
        }
    }
}
