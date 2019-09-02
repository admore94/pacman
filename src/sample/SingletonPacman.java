package sample;

import javafx.scene.Group;

public class SingletonPacman {

    private static Pacman Instance;

    public static Pacman getInstance() {
        if (Instance == null) {
            Instance = new Pacman(2.5 * BarObstacle.THICKNESS, 2.5 * BarObstacle.THICKNESS);
        }

        return Instance;
    }
}
