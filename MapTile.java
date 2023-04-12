import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class MapTile {
    public final String name = null;
    public final int x = 0;
    public  final int y = 0;
    private String intro_text;

    public MapTile(){
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
        moves.add(new MapTile());//MoveEast
        moves.add(new MapTile());//MoveWest
        moves.add(new MapTile());//MoveSouth
        moves.add(new MapTile());//MoveNorth
        return moves;
    }


    public String intro_text() {
        return intro_text;
    }
}
