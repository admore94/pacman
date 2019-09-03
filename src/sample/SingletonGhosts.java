package sample;

import java.util.HashSet;
import java.util.Set;

public class SingletonGhosts {

    private static Set<Ghost> Instance;

    public static Set<Ghost> getInstance() {
        if (Instance == null) {
            Instance = new HashSet<>();
        }

        return Instance;
    }
}
