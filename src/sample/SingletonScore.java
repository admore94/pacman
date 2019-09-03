package sample;

public class SingletonScore {

    private static Score Instance;

    public static Score getInstance() {
        if (Instance == null) {
            Instance = new Score(SingletonGroup.getInstance());
        }

        return Instance;
    }
}
