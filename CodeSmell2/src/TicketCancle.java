public class TicketCancle {
    public void cancle(Ticket ticket, TicketPrint ticketPrint){
        System.out.println("Memproses pembatalan tiket...");
        ticketPrint.allPrint(ticket);
        System.out.println("Pesanan dibatalkan.");
    }
}
