package model;

import service.ParkingLotService;
import service.PaymentService;
import service.TicketService;

public class EntryGate {

    private Attendant attendant;
    private ParkingLotService parkingLotService;
    private TicketService ticketService;

    public  EntryGate(Attendant attendant,ParkingLotService parkingLotService , TicketService ticketService){
        this.attendant = attendant;
        this.parkingLotService = parkingLotService;
        this.ticketService = ticketService;
    }

    public Ticket park(Vehicle vehicle){
       ParkingSlot parkingSlot =  parkingLotService.park(vehicle);
       Ticket ticket = generateTicket(parkingSlot);
       return ticket;
    }
    private Ticket generateTicket(ParkingSlot parkingSlot){
        return ticketService.generateTicket(parkingSlot);
    }

}
