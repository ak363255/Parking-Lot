package parkingStrategy;

 public interface ParkingStrategy {

     public int getNextSlot();
     public void addSlot(int slotNumber);
     public void removeSlot(int slotNumber);

}
