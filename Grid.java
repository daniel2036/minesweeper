import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Grid extends JPanel {
    private int bound = 100;//Game.BOARDSIZE * Game.BOARDSIZE;
    private ArrayList<Integer> mines = new ArrayList<Integer>();
    private boolean picked = false;
    int temp = 10; //replace for boardsize and nummines
    
    public static ArrayList<Tile> tileGrid = new ArrayList<Tile>();

    public Grid(GridLayout g, Rules r){
        super(g);
        createTiles(r);
        addTiles();
    }

    public void createTiles(Rules r){
        // for(int i = 1; i <= Game.NUMMINES ; i++){
            for(int i = 1; i <= 10 ; i++){
            while(!picked){
            int minePosition = (int)(Math.random()*bound);
            if(!mines.contains(minePosition)){
                mines.add(minePosition);
                picked=true;
            }
        }
        picked = false;
        }
        for(int i =0; i<bound; i++){
            if(mines.contains(i)){
                tileGrid.add(new Tile(1, i, false, false, r));
            }
            else if(i%temp==0)
            {
                if(mines.contains(i-temp) || mines.contains(i-temp + 1) || mines.contains(i+1) ||
                mines.contains(i+temp) || mines.contains(i+temp+1)){
                    tileGrid.add(new Tile(2, i ,false, false, r));
                }
                else{
                    tileGrid.add(new Tile(0, i, false, false, r));
                }
            }
            else if(i%temp == temp-1)
            {
                if(mines.contains(i-temp-1)|| mines.contains(i-temp)|| mines.contains(i-1) ||
                mines.contains(i+temp-1) || mines.contains(i+temp)){
                    tileGrid.add(new Tile(2, i ,false, false, r));
                }
                else{
                    tileGrid.add(new Tile(0, i, false, false, r));
                }
            }
            else
            {
                if(mines.contains(i-temp-1)|| mines.contains(i-temp) || mines.contains(i-temp + 1) || mines.contains(i-1) || mines.contains(i+1) ||
                mines.contains(i+temp-1) || mines.contains(i+temp) || mines.contains(i+temp+1)){
                    tileGrid.add(new Tile(2, i ,false, false, r));
                }
                else{
                    tileGrid.add(new Tile(0, i, false, false ,r));
                }
            }
        }
    }
    private void addTiles(){
        for(int i = 0; i<tileGrid.size();i++){
            add(tileGrid.get(i));
        }
    }
}
