package scaffold.utils;

import java.util.Random;
import java.util.function.Supplier;

public class CommonUtils {
    public static Supplier<String> getPlatformName = () -> new Random().nextInt(10) % 2 == 0 ? "Android" : "IOS";
}
