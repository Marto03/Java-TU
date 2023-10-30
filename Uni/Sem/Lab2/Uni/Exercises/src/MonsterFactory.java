import java.util.Random;

public class MonsterFactory {
    public int Generator(Random r) {
        int x = r.nextInt(3);
        return x;
    }

}
