package sample;

import javafx.scene.Group;

public class Root {
    private static Group Instance;

    public static Group getInstance() {
        if (Instance == null) {
            Instance = new Group();
        }

        return Instance;
    }

}
