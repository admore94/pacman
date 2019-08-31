package sample.Factories;

import javafx.scene.paint.Color;
import sample.BarObstacle;
import sample.GameManager;
import sample.Ghost;
import sample.Maze;
import java.util.HashSet;
import java.util.Set;

public class GhostFactory {

    private Set<Ghost> ghosts = new HashSet<>();

    public GhostFactory(GameManager gameManager, Maze maze) {

        ghosts.add(new Ghost(18.5 * BarObstacle.THICKNESS, 12.5 * BarObstacle.THICKNESS, Color.DEEPPINK, maze, gameManager));
        ghosts.add(new Ghost(22.5 * BarObstacle.THICKNESS, 12.5 * BarObstacle.THICKNESS, Color.GREENYELLOW, maze, gameManager));
        ghosts.add(new Ghost(28.5 * BarObstacle.THICKNESS, 12.5 * BarObstacle.THICKNESS, Color.BLACK, maze, gameManager));
        ghosts.add(new Ghost(28.5 * BarObstacle.THICKNESS, 9.5 * BarObstacle.THICKNESS, Color.SPRINGGREEN, maze, gameManager));

    }

    public Set<Ghost> getGhosts() {
        return ghosts;
    }
}
