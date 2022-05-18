import javax.swing.*;
import java.awt.event.*;


    public class Tile extends JButton{  
    private int type;
    private int position;
    private boolean discovered;
    private boolean flagged;
    private Rules rules;

    public Tile(int type, int position, boolean discovered, boolean flagged, Rules rules){
        this.type = type;
        this.position = position;
        this.discovered = discovered;
        this.flagged = flagged;
        this.rules=rules;

        addMouseListener(new MouseListener() {
            @Override

            public void mouseClicked(MouseEvent e){
                if(SwingUtilities.isRightMouseButton(e)){
                    rightClick();
                }
                else{
                    clickButton();
                }
            }
            public void mouseEntered(MouseEvent e){

            }
            public void mouseExited(MouseEvent e){

            }
            public void mousePressed(MouseEvent e){

            }
            public void mouseReleased(MouseEvent e){

            }
            
        });

        }  
         

    public int getType(){
        //types -- 0 = blank; 1 = mine; 2 = number
        return type;
    }
    public int getPosition(){
        return position;
    }

    public boolean isDiscovered(){
        return discovered;
    }
    public void setDiscovered(boolean d){
        this.discovered = d;
    }
    public boolean isFlagged(){
        return flagged;
    }
    public void setFlagged(boolean f){
        this.flagged = f;
    }
    public void clickButton() {
        rules.click(this);
    }
    public void rightClick(){
        rules.rightClick(this);
    }
}
