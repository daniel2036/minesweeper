import javax.swing.*;
import java.awt.*;

public class Window {
    private static JFrame frame;
    private static String title;

    public Window(int width, int height, int boardSize, String title, Game game, Rules rules){
        Window.title=title;
        frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new Grid(new GridLayout(boardSize,boardSize), rules);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void update(int flagged){
        frame.setTitle(title + " Mines: "+ 10 + " - Flags: "+ flagged);
    }
}
