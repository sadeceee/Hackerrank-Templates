package designPatterns;

/**
 * Factory Pattern
 *
 * Created by Tim Kilian on 4/6/16.
 */
public class Factory {

    public Object getObj(String name) {
        if (name.equals(""))
            return new Object();
        else if (name.equals(""))
            return new Object();
      //else if...

        return null;
    }
}
