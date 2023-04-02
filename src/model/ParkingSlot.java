package model;

public class ParkingSlot {

    private Vehicle vehicle;
    private Integer slotId;

    private Integer price;

    public Integer getPrice(){
        return price;
    }
    public  int getSlotId(){
        return slotId;
    }
    public ParkingSlot(int slotId){
        this.slotId = slotId;
    }
    public Vehicle getParkedCar(){
        return vehicle;
    }
    public boolean isSlotFree(){
        return vehicle==null;
    }

    public void assignCar(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void unassignVehicle(){
        this.vehicle = null;
    }


}
