package WithStrategyPattern;

import WithStrategyPattern.DriveStrategy.Sports;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new Sports());
    }
}
