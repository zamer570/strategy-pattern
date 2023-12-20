package WithStrategyPattern;

import WithStrategyPattern.DriveStrategy.Normal;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(){
        super(new Normal());
    }
}
