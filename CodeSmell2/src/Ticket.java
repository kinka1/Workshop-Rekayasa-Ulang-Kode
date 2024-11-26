
public class Ticket {

    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String movieTitle;
    private String movieDate;
    private String movieTime;
    private String seatNumber;

    public String getCustomerName() {
        return this.customerName;
    }

    public String getMovieDate() {
        return this.movieDate;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieTime() {
        return this.movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    String getCustomerPhone() {
        return this.customerPhone;
    }

    String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

}
