package model;

import java.util.*;

public class ParkingLot {

    private int capacity;
    private Map<VehicleType,Map<Integer,ParkingSlot>> parkingSlot;
    public ParkingLot(int capacity){
        this.capacity = capacity;
        this.parkingSlot = new HashMap<>();
    }
    public int getParkingSlotsForVehicle(Vehicle vehicle){
        int freeSpace = capacity - parkingSlot.get(vehicle.getVehicleType()).size();
        return freeSpace;
    }
    public ParkingSlot getParkingSlotById(int slotId, VehicleType vechicleType) throws Exception {
        if(parkingSlot.get(vechicleType).containsKey(slotId)){
            return parkingSlot.get(vechicleType).get(slotId);
        }
        throw new Exception("Invalid slot Number");
    }

    public ParkingSlot park(Vehicle vehicle, final int slotId){
        ParkingSlot slot = parkingSlot.get(vehicle.getVehicleType()).get(slotId);
        slot.assignCar(vehicle);
        return slot;
    }
    public ParkingSlot unPark(final int slotId,VehicleType vehicleType){
        ParkingSlot slot = parkingSlot.get(vehicleType).get(slotId);
        slot.unassignVehicle();
        return slot;
    }


    public int getCapacity(){
        return capacity;
    }



}
