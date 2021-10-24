public abstract class Ticket {
    private final int PNR;
    private final String CONFIRMED = "Confirmed";
    private final String CANCELLED = "Cancelled";
    private String departureLocation;
    private String destinationLocation;
    private Flight travellingFlight;
    private String dateTimeOfDeparture;
    private String dateTimeOfArrival;
    private Passenger bookedPassenger;
    private int seatNo;
    private float ticketPrice;
    private boolean cancelled;
    private String ticketStatus;
    private float flightDuration;

    public Ticket(int PNR, String departureLocation, String destinationLocation, Flight travellingFlight, String dateTimeOfDeparture, String dateTimeOfArrival, Passenger bookedPassenger, int seatNo, float ticketPrice, float flightDuration) {
        this.PNR = PNR;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.travellingFlight = travellingFlight;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTimeOfArrival = dateTimeOfArrival;
        this.bookedPassenger = bookedPassenger;
        this.seatNo = seatNo;
        this.ticketPrice = ticketPrice;
        this.flightDuration = flightDuration;

        this.cancelled = false;
        this.ticketStatus = this.CONFIRMED;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void cancelTicket() {
        this.cancelled = true;
        this.ticketStatus = this.CANCELLED;
    }

    public int getPNR() {
        return PNR;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public Passenger getBookedPassenger() {
        return bookedPassenger;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }


    public Flight getTravellingFlight() {
        return travellingFlight;
    }

    public void setTravellingFlight(Flight travellingFlight) {
        this.travellingFlight = travellingFlight;
    }

    public String getDateTimeOfDeparture() {
        return dateTimeOfDeparture;
    }

    public void setDateTimeOfDeparture(String dateTimeOfDeparture) {
        this.dateTimeOfDeparture = dateTimeOfDeparture;
    }

    public String getDateTimeOfArrival() {
        return dateTimeOfArrival;
    }

    public void setDateTimeOfArrival(String dateTimeOfArrival) {
        this.dateTimeOfArrival = dateTimeOfArrival;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public float getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(float flightDuration) {
        this.flightDuration = flightDuration;
    }
}
