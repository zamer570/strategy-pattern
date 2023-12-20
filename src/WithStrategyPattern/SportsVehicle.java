package WithStrategyPattern;

import WithStrategyPattern.DriveStrategy.Sports;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new Sports());
    }
}
