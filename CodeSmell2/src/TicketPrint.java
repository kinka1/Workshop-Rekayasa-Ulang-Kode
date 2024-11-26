public class TicketPrint {

    public void print(Ticket ticket){
        System.out.println("Pelanggan: " + ticket.getCustomerName() + ", " + ticket.getCustomerPhone() + ", " + ticket.getCustomerEmail());
        System.out.println("Film : " + ticket.getMovieTitle() + " pada " + ticket.getMovieDate() + " jam " + ticket.getMovieTime());
    }

    public void allPrint(Ticket ticket){
        print(ticket);
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
