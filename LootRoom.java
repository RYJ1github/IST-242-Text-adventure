public class LootRoom extends MapTile{
    Item item;
    public boolean pickedItem = false;
    public LootRoom(int x,int y,Item item){
        super();
        this.item = item;

    }
}
