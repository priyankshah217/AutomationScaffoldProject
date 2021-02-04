package scaffold.utils;

import scaffold.exceptions.NoPageObjectFoundExceptions;
import scaffold.pages.base.AbstractPage;

public class PageUtil {
    private final static String platformName = CommonUtils.getPlatformName.get();

    @SuppressWarnings("unchecked")
    public static <T extends AbstractPage> T getPage(Class<T> tClass) {
        final String defaultPackageName = "scaffold.pages";
        final String derivedClassName = defaultPackageName + "."
                                        + platformName.toLowerCase() + "."
                                        + tClass.getSimpleName() + platformName;
        try {
            final Class<?> derivedClass = Class.forName(derivedClassName);
            return (T) derivedClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new NoPageObjectFoundExceptions(tClass + " No Page object found exception");
        }
    }
}
