package designPatterns;

/**
 * Created by Tim Kilian on 4/6/16.
 */

public class Singleton {

    private static Singleton ourInstance;

    public static Singleton getInstance() {
        if (ourInstance == null)
            ourInstance = new Singleton();
        return ourInstance;
    }

    private Singleton() {

    }
}
