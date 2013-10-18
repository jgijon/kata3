package kata3;

public class Main {

    public static void main(String[] args) {
        String filename = args[0];
        CalculateMainDomainHistogramControl control = new CalculateMainDomainHistogramControl(args[0]);
        control.execute();
    }
}
