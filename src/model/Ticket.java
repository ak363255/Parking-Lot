package model;

public class Ticket {
    int ticketId;
    long entryTime;

    int slotId;
    Vehicle vehicle;
    int price;

    public Ticket(int ticketId,int slotId,int price,Vehicle vehicle){
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.vehicle = vehicle;
        this.price = price;
        this.entryTime = System.currentTimeMillis();
    }

    public int getSlotId(){
        return slotId;
    }
    public int getPrice(){
        return price;
    }
    public int getTicketId(){
        return ticketId;
    }
    public long getEntryTime(){
        return entryTime;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
