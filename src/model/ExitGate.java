package model;

import service.ParkingLotService;
import service.PaymentService;
import service.PaymentType;
import service.TicketService;

public class ExitGate {

    private Attendant attendant;
    private ParkingLotService parkingLotService;
    private PaymentService paymentService;
    private TicketService ticketService;

    public ExitGate(Attendant attendant,PaymentService paymentService,TicketService ticketService){
      this.attendant = attendant;
      this.ticketService = ticketService;
      this.paymentService = paymentService;
    }



    public void markSlotFree(int ticketId){
        Ticket ticket = ticketService.getTicket(ticketId);
        int slotId = ticket.getSlotId();
        parkingLotService.makeSlotFree(ticket.getVehicle().getVehicleType(),slotId);
    }
    public boolean makePayment(int ticketId){
        int amount = ticketService.calculateAmount(ticketId);
        return paymentService.makePayment(amount, PaymentType.CASH);
    }
}
