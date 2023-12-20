package WithStrategyPattern.DriveStrategy;

public class Normal implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}
