public class RegularTicket extends Ticket{
    private boolean hasRequestedFood;
    private boolean hasRequestedWater;
    private boolean hasRequestedSnacks;

    public RegularTicket(int PNR, String departureLocation, String destinationLocation, Flight travellingFlight, String dateTimeOfDeparture, String dateTimeOfArrival, Passenger bookedPassenger, int seatNo, float ticketPrice, float flightDuration, boolean requestedFood, boolean requestedWater, boolean requestedSnacks) {
        super(PNR, departureLocation, destinationLocation, travellingFlight, dateTimeOfDeparture, dateTimeOfArrival, bookedPassenger, seatNo, ticketPrice, flightDuration);

        this.hasRequestedFood = requestedFood;
        this.hasRequestedWater = requestedWater;
        this.hasRequestedSnacks = requestedSnacks;
    }

    public boolean isRequestedFood() {
        return hasRequestedFood;
    }

    public void setRequestedFood(boolean hasRequestedFood) {
        this.hasRequestedFood = hasRequestedFood;
    }

    public boolean isRequestedWater() {
        return hasRequestedWater;
    }

    public void setRequestedWater(boolean hasRequestedWater) {
        this.hasRequestedWater = hasRequestedWater;
    }

    public boolean isRequestedSnacks() {
        return hasRequestedSnacks;
    }

    public void setRequestedSnacks(boolean hasRequestedSnacks) {
        this.hasRequestedSnacks = hasRequestedSnacks;
    }
}
