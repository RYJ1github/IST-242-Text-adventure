public class Player {
    String name;
    boolean life;    //true or false

    short hp = 0;

    short damage = 1;

    public Player(String name, short hp, short damage, boolean life) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.life = life;
    }

    public Player(String player1, int hp, int damage, boolean life) {
    }
    public boolean getLife() {
        if (hp < 0) {
            life = false;
        } else if (hp > 1) {
            life = true;
        }
        return life;

    
    }

    public short getHp() {
        return hp;
    }

    public void setHp(short hp) {
        this.hp = hp;
    }
}

