import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface StringBuilderObserver {
    void update(PushPullObservableStringBuilder subject);
}

interface Observable {
    void registerObserver(StringBuilderObserver observer, ObserverMode mode);

    void removeObserver(StringBuilderObserver observer);

    void notifyObservers();
}

enum ObserverMode {
    PUSH,
    PULL
}

public class PushPullObservableStringBuilder extends StringBuilder implements Observable {
    private List<StringBuilderObserver> pushObservers;
    private List<StringBuilderObserver> pullObservers;
    private Map<StringBuilderObserver, ObserverMode> observerModes;

    public PushPullObservableStringBuilder() {
        this.pushObservers = new ArrayList<>();
        this.pullObservers = new ArrayList<>();
        this.observerModes = new HashMap<>();
    }

    @Override
    public void registerObserver(StringBuilderObserver observer, ObserverMode mode) {
        if (mode == ObserverMode.PUSH) {
            pushObservers.add(observer);
        } else {
            pullObservers.add(observer);
        }
        observerModes.put(observer, mode);
    }

    @Override
    public void removeObserver(StringBuilderObserver observer) {
        pushObservers.remove(observer);
        pullObservers.remove(observer);
        observerModes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StringBuilderObserver observer : pushObservers) {
            observer.update(this);
        }

        for (StringBuilderObserver observer : pullObservers) {
            observer.update(this);
        }
    }

    public static void main(String[] args) {
        PushPullObservableStringBuilder observableStringBuilder = new PushPullObservableStringBuilder();

        observableStringBuilder.registerObserver(new MyObserver(), ObserverMode.PUSH);
        observableStringBuilder.registerObserver(new AnotherObserver(), ObserverMode.PULL);

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("Observer!");

        System.out.println(observableStringBuilder.toString());
    }
}

class MyObserver implements StringBuilderObserver {
    @Override
    public void update(PushPullObservableStringBuilder subject) {
        System.out.println("Observer (Push) is notified: " + subject.toString());
    }
}

class AnotherObserver implements StringBuilderObserver {
    @Override
    public void update(PushPullObservableStringBuilder subject) {
        System.out.println("Observer (Pull) is notified: " + subject.toString());
    }
}
