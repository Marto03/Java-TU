import java.util.Scanner;

public interface IElectricalAppliance {
    public abstract void electricity(Scanner scan) throws PowerException;
}
