//import java.util.Scanner;

public class Game {
    public static final int WIDTH = 720, HEIGHT = 720;
    public static final int BOARDSIZE = 10;
    public static final int NUMMINES = 10;

    private Rules rules = new Rules();
    // Scanner boardSize = new Scanner(System.in);
    // System.out.print("Enter a board size (ex: enter 10 to get a 10x10 board) :: ");
    // boardSize = boardSize.nextInt();

    // int numMines = (int)(Math.pow(boardSize,2)/10);

    public Game(){
        new Window(WIDTH, HEIGHT, BOARDSIZE, "Minesweeper", this, rules);
    }

    public static void main(String[] args)
    {
        new Game();
    }

}
