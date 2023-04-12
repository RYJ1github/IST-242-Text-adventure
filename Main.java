public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //goldBar, magicSword, softPillow, and bigMace.
        Gold goldbar = new Gold(10);
        Gold silverbar = new Gold(5);
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigmace = new Mace();

        //LM2:greenOgre, redOgre, slowZombie, fastZombie, spotDog, and yourNameYourObject.

        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog();
        Skullhead deadSkullhead = new Skullhead(Ability.Stalking);
        Player player1 = new Player("Player1");
        World world = new World();
        world.load_tiles();


    }
}