public class BookTicket {
    public void bookTiket(Ticket ticket, TicketPrint ticketPrint){
        System.out.println("Memproses pemesanan tiket...");
        ticketPrint.allPrint(ticket);
        System.out.println("Pesanan selesai.");
    }
}
