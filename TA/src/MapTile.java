import java.util.ArrayList;
import java.util.List;

public class MapTile {
    public final String name;
    public final int x;
    public  final int y;
    public MapTile(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName(){
        return  name;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public List<MapTile>adjacent_moves(){
        List<MapTile> moves = new ArrayList<>();
        moves.add(new MapTile(name,x + 1,y));//MoveEast
        moves.add(new MapTile(name,x - 1,y));//MoveWest
        moves.add(new MapTile(name,x,y + 1));//MoveSouth
        moves.add(new MapTile(name,x ,y - 1));//MoveNorth
        return moves;
    }
}
