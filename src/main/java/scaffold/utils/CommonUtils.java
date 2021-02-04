package scaffold.utils;

import java.util.Random;

public class CommonUtils {
    public static String getPlatformName() {
        return new Random().nextInt(10) % 2 == 0 ? "Android" : "IOS";
    }
}
