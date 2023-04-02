package parkingStrategy;

import java.util.TreeSet;

public class NaturalParkingSlotStrategyImpl implements ParkingStrategy{

    private TreeSet<Integer> parkingSlot;

    public NaturalParkingSlotStrategyImpl(){
        parkingSlot = new TreeSet<>();
    }
    @Override

    public int getNextSlot() {
        return this.parkingSlot.first();
    }

    @Override
    public void addSlot(int slotNumber) {
        this.parkingSlot.add(slotNumber);
    }

    @Override
    public void removeSlot(int slotNumber) {
     this.parkingSlot.remove(slotNumber);
    }
}
