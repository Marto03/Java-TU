import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> stringList = Arrays.asList("asd", "df", "f");
        System.out.println("Digits: " + checkList(stringList, s -> s.matches("\\d+")));
        System.out.println("Letters: " + checkList(stringList, s -> s.matches("[a-zA-Z]+")));
        System.out.println("Special characters: " + checkList(stringList, s -> s.matches("[^a-zA-Z0-9]+")));
    }

    private static boolean checkList(List<String> stringList, Predicate<String> condition) {
        for (String s : stringList) {
            if (!condition.test(s)) {
                return false;
            }
        }
        return true;
    }
}
