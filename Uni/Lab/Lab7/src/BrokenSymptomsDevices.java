import java.util.Comparator;

public class BrokenSymptomsDevices implements Comparator<BrokenDevice> {

    @Override
    public int compare(BrokenDevice o1, BrokenDevice o2) {
        String symptoms = o1.getSymptoms();
        String symptoms2 = o2.getSymptoms();
        return o1.compareTo(o2);
    }

}