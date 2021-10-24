public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocations = new String[5];
    private int availableSpots = 0;

    public TouristTicket(int PNR, String departureLocation, String destinationLocation, Flight travellingFlight, String dateTimeOfDeparture, String dateTimeOfArrival, 
                         Passenger bookedPassenger, int seatNo, float ticketPrice, float flightDuration, String hotelAddress, String[] touristLocations) {
        super(PNR, departureLocation, destinationLocation, travellingFlight, dateTimeOfDeparture, dateTimeOfArrival, bookedPassenger, seatNo, ticketPrice, flightDuration);

        this.hotelAddress = hotelAddress;
        if (touristLocations.length <= 5) {
            for (int i = 0; i < touristLocations.length; i++) {
                this.touristLocations[i] = touristLocations[i];
            }
            this.availableSpots = 5 - touristLocations.length;
        }
    }

    public String[] getTouristLocations(){
        return this.touristLocations;
    }

    // Add tourist location if the max location is less than 5
    public boolean addTouristLocation(String location) {
        if (availableSpots > 0) {
            this.touristLocations[5-availableSpots] = location;
            availableSpots--;
            return true;
        }
        return  false;
    }

    // remove last entered tourist location
    public void removeLastTouristLocation() {
        for(int i = this.touristLocations.length-1; i >=0; i--) {
            if (this.touristLocations[i] != null) {
                this.touristLocations[i] = null;
                availableSpots++;
                break;
            }
        }
    }
}
