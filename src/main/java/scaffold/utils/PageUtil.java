package scaffold.utils;

import scaffold.exceptions.NoPageObjectFoundExceptions;
import scaffold.pages.base.AbstractPage;

import java.lang.reflect.InvocationTargetException;

public class PageUtil {

    @SuppressWarnings("unchecked")
    public static <T extends AbstractPage> T getPage(Class<T> tClass) {
        final String defaultPackageName = "scaffold.pages";
        final String platformName = CommonUtils.getPlatformName();
        final String derivedClassName = defaultPackageName + "."
                                        + platformName.toLowerCase() + "."
                                        + tClass.getSimpleName() + platformName;
        final Class<?> derivedClass;
        try {
            derivedClass = Class.forName(derivedClassName);
            return (T) derivedClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new NoPageObjectFoundExceptions(tClass + " No Page object found exception");
        }
    }
}
