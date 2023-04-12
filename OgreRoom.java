public class OgreRoom extends MapTile {
    Ogre enemy;

    public OgreRoom(int x, int y, Ogre ogre) {
        super();
        this.enemy = ogre;
    }

    public String intro_text(){
        if(enemy.is_alive()){
            return"A Giant cyclops comes out.";
        }else{
            return"The corpse of dead Ogre rots on the ground.";
        }
    }
}


