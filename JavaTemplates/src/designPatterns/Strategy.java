package designPatterns;

/**
 * Created by Tim Kilian on 4/10/16.
 */
public interface Strategy {
    int doOperation();
}

class Operation1 implements Strategy {
    @Override
    public int doOperation() {
        return 0;
    }
}

class Operation2 implements Strategy {
    @Override
    public int doOperation() {
        return 1;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy() {
        return strategy.doOperation();
    }
}