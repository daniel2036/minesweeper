import java.util.ArrayList;


public class Rules {

    private ArrayList<Tile> current = new ArrayList<Tile>();
    private ArrayList<Tile> queue = new ArrayList<Tile>();
    int number = 10; //replace boardsize and nummines
    private static int flaggedTiles = 0;

    public void click(Tile tile){
        int discoveredTiles=0;
        if(!tile.isFlagged()){
            tile.setEnabled(false);
            tile.setDiscovered(true);
        
        

        int position = tile.getPosition();
        if(tile.getType()==0){
            if(position< number){
                if(position%number == 0){
                    queue.add(Grid.tileGrid.get((position+ number)));
                    queue.add(Grid.tileGrid.get((position+ number +1)));
                    queue.add(Grid.tileGrid.get((position+ 1)));
                }
                else if(position%number ==number -1){
                    queue.add(Grid.tileGrid.get((position+ number)));
                    queue.add(Grid.tileGrid.get((position+ number -1)));
                    queue.add(Grid.tileGrid.get((position- 1)));
                }
                else{
                    queue.add(Grid.tileGrid.get((position+ number)));
                    queue.add(Grid.tileGrid.get((position+ number +1)));
                    queue.add(Grid.tileGrid.get((position+ number -1)));
                    queue.add(Grid.tileGrid.get((position+ 1)));
                    queue.add(Grid.tileGrid.get((position- 1)));
                }
            }
            else if(position>= number*(number-1)){
                if(position%number == 0){
                    queue.add(Grid.tileGrid.get((position- number)));
                    queue.add(Grid.tileGrid.get((position- number +1)));
                    queue.add(Grid.tileGrid.get((position+ 1)));
                }
                else if(position%number ==number -1){
                    queue.add(Grid.tileGrid.get((position- number)));
                    queue.add(Grid.tileGrid.get((position- number -1)));
                    queue.add(Grid.tileGrid.get((position- 1)));
                }
                else{
                    queue.add(Grid.tileGrid.get((position- number)));
                    queue.add(Grid.tileGrid.get((position- number +1)));
                    queue.add(Grid.tileGrid.get((position- number -1)));
                    queue.add(Grid.tileGrid.get((position+ 1)));
                    queue.add(Grid.tileGrid.get((position- 1)));
                }

            }
            else if(position%number ==0){
                queue.add(Grid.tileGrid.get((position- number)));
                queue.add(Grid.tileGrid.get((position+ number)));
                queue.add(Grid.tileGrid.get((position- number +1)));
                queue.add(Grid.tileGrid.get((position+ number +1)));
                queue.add(Grid.tileGrid.get((position+ 1)));
                
            }
            else if(position%number ==number-1){
                queue.add(Grid.tileGrid.get((position- number)));
                queue.add(Grid.tileGrid.get((position+ number)));
                queue.add(Grid.tileGrid.get((position- number -1)));
                queue.add(Grid.tileGrid.get((position+ number -1)));
                queue.add(Grid.tileGrid.get((position - 1)));

            }
            else{
                queue.add(Grid.tileGrid.get((position- number)));
                queue.add(Grid.tileGrid.get((position+ number)));
                queue.add(Grid.tileGrid.get((position- number -1)));
                queue.add(Grid.tileGrid.get((position+ number -1)));
                queue.add(Grid.tileGrid.get((position- number +1)));
                queue.add(Grid.tileGrid.get((position+ number +1)));
                queue.add(Grid.tileGrid.get((position - 1)));
                queue.add(Grid.tileGrid.get((position + 1)));
            }
        }
        else if(tile.getType()==1){
            for(int i =0; i<Grid.tileGrid.size();i++){
                Grid.tileGrid.get(i).setEnabled(false);
                Grid.tileGrid.get(i).setText("");
                if(Grid.tileGrid.get(i).getType()==1){
                    Grid.tileGrid.get(i).setText("X");
                }
            }
            tile.setText("*");
        }
        else if(tile.getType()==2){
            int mineCount = 0;
            if(position<number){
                if(position%number==0){
                    if(Grid.tileGrid.get((position+number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+number+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+1)).getType()==1){
                        mineCount++;
                    }
                }
                else if(position %number==number-1){
                    if(Grid.tileGrid.get((position+number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+number-1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-1)).getType()==1){
                        mineCount++;
                    }
                }
                else{
                    if(Grid.tileGrid.get((position+number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+number+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+number-1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-1)).getType()==1){
                        mineCount++;
                    }
                }
            }
            else if(position>=(number*(number-1))){
                if(position%number==0){
                    if(Grid.tileGrid.get((position-number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-number+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+1)).getType()==1){
                        mineCount++;
                    }
                }
                else if(position %number==number-1){
                    if(Grid.tileGrid.get((position-number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-number-1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-1)).getType()==1){
                        mineCount++;
                    }
                }
                else{
                    if(Grid.tileGrid.get((position-number)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-number+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-number-1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position+1)).getType()==1){
                        mineCount++;
                    }
                    if(Grid.tileGrid.get((position-1)).getType()==1){
                        mineCount++;
                    }
                }
            }
            else if(position%number ==0){
                if(Grid.tileGrid.get((position-number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-number+1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number+1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+1)).getType()==1){
                    mineCount++;
                }
            
            }
            else if(position%number==number-1){
                if(Grid.tileGrid.get((position-number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-number-1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number-1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-1)).getType()==1){
                    mineCount++;
                }
            }
            else{
                if(Grid.tileGrid.get((position-number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-number-1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number-1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-number+1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+number+1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position-1)).getType()==1){
                    mineCount++;
                }
                if(Grid.tileGrid.get((position+1)).getType()==1){
                    mineCount++;
                }
            }
            tile.setText(String.valueOf(mineCount));

        }
        for(int i = 0; i<queue.size(); i++){
            if(!queue.get(i).isDiscovered()){
                current.add(queue.get(i));
                queue.get(i).setDiscovered(true);
            }
        }
        queue.clear();
        while(!current.isEmpty()){
            Tile temp = current.get(0);
            current.remove(0);
            temp.clickButton();
        }
        if(discoveredTiles==Grid.tileGrid.size()-number){
            for(int i =0; i<Grid.tileGrid.size(); i++){
                if(Grid.tileGrid.get(i).getType()==1){
                    Grid.tileGrid.get(i).setEnabled(false);
                    Grid.tileGrid.get(i).setText("X");
                }
                else{
                    Grid.tileGrid.get(i).setEnabled(false);
                    Grid.tileGrid.get(i).setText(":)");
                }
            }
        }
    }
    }
    public void rightClick(Tile tile){
        if(!tile.isDiscovered()){
            if(!tile.isFlagged()){
                tile.setFlagged(true);
                tile.setText("F");
                flaggedTiles++;
                Window.update(flaggedTiles);
            }
            else{
                tile.setFlagged(false);
                tile.setText("");
                flaggedTiles--;
                Window.update(flaggedTiles);

            }
        }
    }
}
