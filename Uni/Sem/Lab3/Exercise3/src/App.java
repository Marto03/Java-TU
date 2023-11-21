public class App {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();

        observableStringBuilder.registerObserver(new MyObserver());

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("Observer!");

        System.out.println(observableStringBuilder.toString());
    }
}
