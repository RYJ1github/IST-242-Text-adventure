import java.util.ArrayList;

public class Player {
    String name;
    boolean life;    //true or false

    short hp = 0;

    short damage = 1;
    private Enemy enemy;

    public Player(String name, short hp, short damage, boolean life) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.life = life;
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

    public int getLocation_x() {
        return getLocation_x();
    }

    public int setLocation_x() {
        int x;
        this.setLocation_x() = x;
        return x;
    }

    public int getLocation_y() {
        return getLocation_y();
    }

    public int setLocation_y() {
        int y;
        this.setLocation_y() = y;
        return y;
    }

    int location_x;
    int location_y;
    Boolean victory;
    int prevLocatnX, prevLocatnY;
    ArrayList<Item> inventory = new ArrayList<Item>();

    public Player(String name) {
        super();
        this.name = name;
        inventory.add(new Gold(15));
        inventory.add(new Pillow());
        this.hp = 140; // Health Points
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
        this.victory = false; //no victory on start up
    }

    public boolean is_alive() {
        return (hp > 0);
    }

    public void print_inventory() {
        int totalGold = 0;
        Gold geld = null;
        for (Item item : inventory) {
            if (!(item instanceof Gold)) {

                System.out.println(item.toString());
            } else {
                geld = (Gold) item;
                totalGold += geld.amt;
            }

        }
        Item gold = new Gold(totalGold);
        int plyrGold = totalGold;
        System.out.println(gold.toString());
    }

    public void updateGold() {
        int totalGold = 0;
        Gold geld = null;
        for (Item item : inventory) {
            if (!(item instanceof Gold)) {

            } else {
                geld = (Gold) item;
                totalGold += geld.amt;
            }

        }
        Item gold = new Gold(totalGold);
        int plyrGold = totalGold;

    }

    public void move(int dx, int dy) {
        prevLocatnX = location_x;
        prevLocatnY = location_y;
        location_x += dx;
        location_y += dy;
        System.out.print(World.tile_exists(location_x, location_y).intro_text());
    }

    public void move_north() {
        move(-1, 0);
    }

    public void move_south() {
        move(1, 0);
    }

    public void move_east() {
        move(0, 1);
    }

    public void move_west() {
        move(0, -1);
    }



    System.out.println("You use %s against %s!", best_weapon.name, enemy.name);
    enemy.hp -= best_weapon.getDamage();
    if (!enemy.is_alive()) {
            System.out.printf("You killed %s!", enemy.name);
        } else {
            System.out.printf("%s HP is %d.", enemy.name, enemy.hp);
        }
    }

    public void attackEnemy(Enemy enemy) {
        this.enemy = enemy;
        Weapon best_weapon = new Weapon("None", "None", 0, 0);
        int max_dmg = 0;
        for (Item i : inventory) {
            if (i instanceof Weapon) {
                Weapon wpn = (Weapon) i;
                if (wpn.getDamage() > max_dmg) {
                    max_dmg = wpn.getDamage();
                    best_weapon = wpn;
                }
            }
        } //End Code block for loop
        System.out.printf("You use %s against %s!", best_weapon.name, enemy.name);
        enemy.hp -= best_weapon.getDamage();
        if (!enemy.is_alive()) {
            System.out.printf("You killed %s!", enemy.name);
        } else {
            System.out.printf("%s HP is %d.", enemy.name, enemy.hp);
        }
    }

    public void do_action(Action action, Enemy kwargs, MapTile mp) {
        if (kwargs == null) {
            if (action instanceof MoveEast) {
                move_east();
            } else if (action instanceof MoveWest) {
                move_west();
            } else if (action instanceof MoveNorth) {
                move_north();
            } else if (action instanceof MoveSouth) {
                move_south();
            } else if (action instanceof ViewInventory) {
                print_inventory();
            } else if (action instanceof Attack) {
                attackEnemy(null);
            }

        } //End Code block do_attack method*/
    }
}


