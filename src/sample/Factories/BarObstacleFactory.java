package sample.Factories;

import sample.BarObstacle;
import java.util.HashSet;
import java.util.Set;

public class BarObstacleFactory {

    private Set<BarObstacle> barObstacles = new HashSet<>();

    public BarObstacleFactory() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~ frame ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // top
        barObstacles.add(new BarObstacle(0, 0, "horizontal", 48));
        // bottom
        barObstacles.add(new BarObstacle(0, 600, "horizontal", 48));
        // left
        barObstacles.add(new BarObstacle(0, 0, "vertical", 25));
        // right
        barObstacles.add(new BarObstacle(1225 - BarObstacle.THICKNESS, 0, "vertical", 25));

        //~~~~~~~~~~~~~~~~~~~~~~~~~ Islands ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // obsTopLeft
        barObstacles.add(new BarObstacle(12 * BarObstacle.THICKNESS, BarObstacle.THICKNESS, "vertical", 4));
        // obsTopRight
        barObstacles.add(new BarObstacle(36 * BarObstacle.THICKNESS, BarObstacle.THICKNESS, "vertical", 4));
        // obsBottomLeft
        barObstacles.add(new BarObstacle(12 * BarObstacle.THICKNESS, 600 - 4 * BarObstacle.THICKNESS, "vertical", 4));
        // obsBottomRight
        barObstacles.add(new BarObstacle(36 * BarObstacle.THICKNESS, 600 - 4 * BarObstacle.THICKNESS, "vertical", 4));
        // obsTopMiddle
        barObstacles.add(new BarObstacle(16 * BarObstacle.THICKNESS, 4 * BarObstacle.THICKNESS, "horizontal", 17));
        // obsBottomMiddle
        barObstacles.add(new BarObstacle(16 * BarObstacle.THICKNESS, 600 - 4 * BarObstacle.THICKNESS, "horizontal", 17));
        // obsLMTop
        barObstacles.add(new BarObstacle(8 * BarObstacle.THICKNESS, 8 * BarObstacle.THICKNESS, "horizontal", 5));
        // obsLMTop4
        barObstacles.add(new BarObstacle(8 * BarObstacle.THICKNESS, 12 * BarObstacle.THICKNESS, "horizontal", 5));
        // obsLMBottom
        barObstacles.add(new BarObstacle(8 * BarObstacle.THICKNESS, 16 * BarObstacle.THICKNESS, "horizontal", 5));
        // obsRMTop
        barObstacles.add(new BarObstacle(36 * BarObstacle.THICKNESS, 8 * BarObstacle.THICKNESS, "horizontal", 5));
        // obsRMTop2
        barObstacles.add(new BarObstacle(36 * BarObstacle.THICKNESS, 12 * BarObstacle.THICKNESS, "horizontal", 5));
        // obsRMBottom
        barObstacles.add(new BarObstacle(36 * BarObstacle.THICKNESS, 16 * BarObstacle.THICKNESS, "horizontal", 5));
        // LobsLeftTop1
        barObstacles.add(new BarObstacle(4 * BarObstacle.THICKNESS, 4 * BarObstacle.THICKNESS, "horizontal", 5));
        // LobsLeftTop2
        barObstacles.add(new BarObstacle(4 * BarObstacle.THICKNESS, 5 * BarObstacle.THICKNESS, "vertical", 6));
        // LobsLeftBottom1
        barObstacles.add(new BarObstacle(4 * BarObstacle.THICKNESS, 600 - 4 * BarObstacle.THICKNESS, "horizontal", 5));
        // LobsLeftBottom2
        barObstacles.add(new BarObstacle(4 * BarObstacle.THICKNESS, 600 - 10 * BarObstacle.THICKNESS, "vertical", 6));
        // LobsRightTop1
        barObstacles.add(new BarObstacle(40 * BarObstacle.THICKNESS, 4 * BarObstacle.THICKNESS, "horizontal", 5));
        // LobsRightTop2
        barObstacles.add(new BarObstacle(44 * BarObstacle.THICKNESS, 5 * BarObstacle.THICKNESS, "vertical", 6));
        // LobsRightBottom1
        barObstacles.add(new BarObstacle(40 * BarObstacle.THICKNESS, 600 - 4 * BarObstacle.THICKNESS, "horizontal", 5));
        // LobsRightBottom2
        barObstacles.add(new BarObstacle(44 * BarObstacle.THICKNESS, 600 - 10 * BarObstacle.THICKNESS, "vertical", 6));
        // cageBottom
        barObstacles.add(new BarObstacle(16 * BarObstacle.THICKNESS, 600 - 8 * BarObstacle.THICKNESS, "horizontal", 17));
        // cageRightV
        barObstacles.add(new BarObstacle(32 * BarObstacle.THICKNESS, 600 - 16 * BarObstacle.THICKNESS, "vertical", 8));
        // cageLeftV
        barObstacles.add(new BarObstacle(16 * BarObstacle.THICKNESS, 600 - 16 * BarObstacle.THICKNESS, "vertical", 8));
        // cateRightH
        barObstacles.add(new BarObstacle(17 * BarObstacle.THICKNESS, 8 * BarObstacle.THICKNESS, "horizontal", 5));
        // cateLeftH
        barObstacles.add(new BarObstacle(27 * BarObstacle.THICKNESS, 8 * BarObstacle.THICKNESS, "horizontal", 5));

    }

    public Set<BarObstacle> getBarObstacles() {
        return barObstacles;
    }
}
