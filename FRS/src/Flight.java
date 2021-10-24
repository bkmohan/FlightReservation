public class Flight {
    private int flightNo;
    private String airlines;
    private int flightCapacity;
    private int noOfSeatBooked;

    public Flight(int flightNo, String airlines, int flightCapacity) {
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.flightCapacity = flightCapacity;
        this.noOfSeatBooked = 0;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getAirlines() {
        return airlines;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public int getNoOfSeatBooked() {
        return noOfSeatBooked;
    }

    // Books seat only if the No of seats booked is less than flight capacity
    public void bookSeat(){
        if (this.noOfSeatBooked < this.flightCapacity) {
            this.noOfSeatBooked++;
        }
    }

    public boolean checkAvailability(){
        return  (this.noOfSeatBooked < this.flightCapacity);
    }
}
