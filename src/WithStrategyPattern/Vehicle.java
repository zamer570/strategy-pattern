package WithStrategyPattern;

import WithStrategyPattern.DriveStrategy.DriveStrategy;
import WithStrategyPattern.DriveStrategy.Sports;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy strategy){
        driveStrategy = strategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
