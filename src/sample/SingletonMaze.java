package sample;

import java.util.HashSet;
import java.util.Set;

public class SingletonMaze {
    private static Maze Instance;

    public static Maze getInstance() {
        if (Instance == null) {
            Instance = new Maze();
        }

        return Instance;
    }
}
