import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
        World world = new World();
        World.load_tiles();
        String playerName = "Team deadly game";
        Player player = new Player(playerName);
        MapTile room = World.tile_exists(player.location_x, player.location_y);
        if (room != null) {
            System.out.print(room.intro_text());
            while ((player.is_alive()) && (!player.victory)) {
                room = World.tile_exists(player.location_x, player.location_y);
                room.modify_player(player);
                if ((player.is_alive()) && (!player.victory)) {
                    System.out.print(room.intro_text());
                    while ((player.is_alive()) && (!player.victory)) {
                        room = World.title_exists(player.location_x, player.location_y);
                        // System.out.print(room.intro_text());
                        room.modify_player(player);
                        // Check again since the room could have changed the player's state
                        if ((player.is_alive()) && (!player.victory)) {
                            System.out.print("Choose an action:\n");
                            ArrayList<Action> available_actions = room.available_actions();
                            for (Action action : available_actions) {
                                System.out.print(action.getHotkey() + " : " + action.getName() + "\n");
                            }
                            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                            System.out.println("Action: ");
                            char action_input = in.readLine().charAt(0);
                            for (Action action : available_actions) {
                                if (action_input == action.getHotkey()) {
                                    player.do_action(action, action.getKwargs(), room);
                                    break;
                                }
                            }
                        } else {
                            System.out.println("\n \t Game Over!!!");

                        }
                    }
                }
            }
        }
    }
}