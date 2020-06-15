package sudoku;

public class SingleGame {

    private final int[][] gameBoard;
    public static final int EMPTY = 0;
    public static final int SIZE = 9;

    public SingleGame(int[][] gameBoard) {
        this.gameBoard = new int[SIZE][SIZE];

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                this.gameBoard[i][j] = gameBoard[i][j];
            }
        }
    }

    //check if number is possible in 3x3 box
    private boolean isAlreadyInBox(int row, int column, int number) {
        int r = row - row % 3;
        int c = column - column % 3;

        for(int i = r; i < r + 3; i++) {
            for(int j = c; j < c + 3; j++) {
                if(gameBoard[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAlreadyInColumn(int column, int number) {
        for(int i = 0; i < SIZE; i++) {
            if(gameBoard[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isAlreadyInRow(int row, int number) {
        for(int i = 0; i < SIZE; i++) {
            if(gameBoard[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    //check if a number is possible to a row and column position ok
    private boolean isPossibleNumberPositionOk(int row, int column, int number) {
        return !isAlreadyInRow(row, number) && !isAlreadyInColumn(column, number) && !isAlreadyInBox(row, column, number);
    }

    //recursive fucking BackTracking algorithm.
    public boolean resolveSudoku() {
        for(int row = 0; row < SIZE; row++) {
            for(int column = 0; column < SIZE; column++) {
                //search for empty cell
                if(gameBoard[row][column] == EMPTY) {
                    //try possible numbers
                    for(int number = 1; number <= SIZE; number++) {
                        if(isPossibleNumberPositionOk(row, column, number)) {
                            //number is ok so game respects sudoku constraints
                            gameBoard[row][column] = number;

                            //start backtracking algorithm
                            if(resolveSudoku()) {
                                return true;
                                // if not a solution, we empty the cell and we continue
                            } else {
                                gameBoard[row][column] = EMPTY;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                System.out.print(" " + gameBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}

