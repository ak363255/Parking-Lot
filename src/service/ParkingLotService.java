package service;
import model.ParkingLot;
import model.ParkingSlot;
import model.Vehicle;
import model.VehicleType;
import parkingStrategy.ParkingStrategy;
public class ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

      public ParkingLotService(ParkingLot parkingLot,ParkingStrategy parkingStrategy){
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;
        addParkingSlot(parkingLot.getCapacity());
    }

    private void addParkingSlot(int capacity){
        for(int i = 0;i<capacity;i++){
            parkingStrategy.addSlot(i);
        }
    }

    public ParkingSlot park(Vehicle vehicle){
      int slotId =  parkingStrategy.getNextSlot();
      ParkingSlot parkingSlot = parkingLot.park(vehicle,slotId);
      return parkingSlot;
    }
    public void makeSlotFree(VehicleType vehicleType, final Integer slotNumber){
        parkingLot.unPark(slotNumber,vehicleType);
    }

    public int getAvailableParkingSlot(Vehicle vehicle){
        return parkingLot.getParkingSlotsForVehicle(vehicle);
    }
}
