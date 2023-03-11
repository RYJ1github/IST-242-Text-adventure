import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class World {
    private String[][] world;
    private Point startingPosition;
    private ArrayList<MapTile> history;

    public World() {
        world = null;
        startingPosition = null;
        history = new ArrayList<>();
    }

    public void loadWorld(String fileName) throws IOException {
        List<String> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/map.txt"))) {
            String row;
            while ((row = reader.readLine()) != null) {
                rows.add(row);
            }
        }
        int numRows = rows.size();
        int numCols = rows.get(0).split("\t").length;
        world = new String[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            String[] cols = rows.get(row).split("\t");
            for (int col = 0; col < numCols; col++) {
                String tileName = cols[col];
                if (tileName.equals("Startingroom")) {
                    startingPosition = new Point(col, row);
                }
                world[row][col] = tileName.trim().isEmpty() ? null : tileName;
            }
        }
    }

    // Getter methods
    public String[][] getWorld() {
        return world;
    }

    public Point getStartingPosition() {
        return startingPosition;
    }

    public ArrayList<MapTile> getHistory() {
        return history;
    }
}
