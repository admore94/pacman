package sample;

import java.util.HashSet;
import java.util.Set;

public class SingletonCookieSet {

    private static Set<Cookie> Instance;

    public static Set<Cookie> getInstance() {
        if (Instance == null) {
            Instance = new HashSet<>();
        }

        return Instance;
    }
}
