import java.util.ArrayList;
import java.util.List;

interface StringBuilderObserver {
    void update(StringBuilderSubject subject);
}

interface StringBuilderSubject {
    void registerObserver(StringBuilderObserver observer);

    void removeObserver(StringBuilderObserver observer);

    void notifyObservers();
}

public class ObservableStringBuilder implements StringBuilderSubject {
    private StringBuilder stringBuilder;
    private List<StringBuilderObserver> observers;

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return this;
    }

    public int length() {
        return stringBuilder.length();
    }

    @Override
    public void registerObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StringBuilderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StringBuilderObserver observer : observers) {
            observer.update(this);
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }

}

class MyObserver implements StringBuilderObserver {
    @Override
    public void update(StringBuilderSubject subject) {
        System.out.println("Object is changed: " + ((ObservableStringBuilder) subject).toString());
    }
}
