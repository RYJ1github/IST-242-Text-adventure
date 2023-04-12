public class GiantspiderRoom extends MapTile {
    public GiantspiderRoom(int x, int y, Giantspider giantspider) {
        super();
        this.enemy = giantspider;
    }
    Giantspider enemy;
    public String intro_text(){
        if(enemy.is_alive()){
            return"A giantspider comes out.";
        }else{
            return"The giantspider was dead.";
        }
    }
}
