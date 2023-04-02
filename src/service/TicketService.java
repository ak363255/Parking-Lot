package service;

import model.ParkingSlot;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketService {

    Map<Integer,Ticket> tickets;
    public TicketService(){
        tickets  = new HashMap<>();
    }
    public Ticket generateTicket(
            ParkingSlot parkingSlot
    ){
        int ticketId = 0;
        Ticket ticket = new Ticket(ticketId,parkingSlot.getSlotId(),parkingSlot.getPrice(),parkingSlot.getParkedCar());
        tickets.put(ticketId,ticket);
        return ticket;
    }
    public Ticket getTicket(int ticketId){
        return tickets.get(ticketId);
    }

    public int calculateAmount(int ticketId){
        Ticket ticket = tickets.get(ticketId);
        long amount = ((System.currentTimeMillis() - ticket.getEntryTime())/1000)*ticket.getPrice();
        return (int)amount;
    }


}
