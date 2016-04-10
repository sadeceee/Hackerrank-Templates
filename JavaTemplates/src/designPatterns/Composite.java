package designPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim Kilian on 4/9/16.
 */
public abstract class Composite {
    List<Composite> subordinates;

    public Composite() {
        subordinates = new ArrayList<>();
    }

    // some Operations
    public abstract void operation();

    public void add(Composite c) {
        subordinates.add(c);
    }

    public void remove(Composite c) {
        subordinates.remove(c);
    }

    public List<Composite> getSubordinates() {
        return subordinates;
    }

    public Composite getComposite() {
        return (subordinates.isEmpty()) ? null : this;
    }
}

class leaf extends Composite {

    public void operation() {

    }
}