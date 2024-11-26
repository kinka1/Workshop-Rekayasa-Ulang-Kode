public class TicketReschedule {
    public void reschedule(Ticket oldTicket,Ticket newTicket, TicketPrint ticketPrint){
        System.out.println("Memproses pengubahan jadwal tiket...");
        ticketPrint.print(oldTicket);
        System.out.println("Jadwal lama: " + oldTicket.getMovieDate() + " jam " + oldTicket.getMovieTime());
        System.out.println("Jadwal baru: " + newTicket.getMovieDate() + " jam " + newTicket.getMovieTime());
        System.out.println("Kursi: " + newTicket.getSeatNumber());
        System.out.println("Pesanan diubah.");
    }
}
