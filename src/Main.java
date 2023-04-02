import model.ParkingLot;
import parkingStrategy.NaturalParkingSlotStrategyImpl;
import parkingStrategy.ParkingStrategy;
import service.ParkingLotService;

import java.util.List;

/*
    Requirements for car parking lot
    1. There should be multiple floor in parking lot.
    2. There should be multiple gate in parking gate
    3. There should be a parking attendent at each gate.
    4. The entry gate should process parking tickets.
    5. The exit gate sould process payment process.
    6.There should be parking  at each parking floor.
 */
public class Main {
    public static void main(String[] args) {
        int capacity = 100;
        ParkingLot parkingLot = new ParkingLot(capacity);
        ParkingStrategy parkingStrategy = new NaturalParkingSlotStrategyImpl();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLot,parkingStrategy);
    }
}
