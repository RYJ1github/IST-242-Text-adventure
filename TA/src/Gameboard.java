public class Gameboard {
    public String name;
    public Gametype gametype;

    public Gameboard(String name){
        this.name = name;
        this.gametype = Gametype.TwoD;
    }
}
