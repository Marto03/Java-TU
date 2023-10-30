import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        IMonster[] IMonsters = new IMonster[5];
        Zombie z = new Zombie();
        Vampire v = new Vampire();
        Dragon d = new Dragon();
        MonsterFactory monsterFactory = new MonsterFactory();
        Random r = new Random();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int x = monsterFactory.Generator(r);
            switch (x) {
                case 0:
                    IMonsters[i] = z;
                    count += z.attack();
                    break;
                case 1:
                    IMonsters[i] = v;
                    count += v.attack();
                    break;
                case 2:
                    IMonsters[i] = d;
                    count += d.attack();
                    break;
                default:
                    break;
            }
        }
        for (IMonster x : IMonsters) {
            System.out.println(x.toString());
        }
        System.out.println("Counter: " + count);
        if (count < 50) {
            System.out.println("The champion won");
        } else {
            System.out.println("The champion is destroyed");
        }
    }
}
