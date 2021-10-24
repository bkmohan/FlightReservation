public class Main {

    public static void main(String[] args) {
        Flight f1 = new Flight(13, "Tata Airlines", 500);
        Passenger p1 = new Passenger("Mohan", "988664545", "mohankrishnabk@gmail.com", "Bommasandra", "Bangaore", "Karnataka");
        RegularTicket rt = new RegularTicket(21123, "Bangalore", "Chennai", f1, "2021-10-31 11:30", "2021-10-31 14:30", p1, 123, 555.5f, 126, true, true, false);

        String[] locations = {"Place1", "Place2"};
        TouristTicket tt = new TouristTicket(13236, "Bangalore", "Chennai", f1, "2021-10-31 11:30", "2021-10-31 14:30", p1, 123, 555.5f, 126, "Adigas Road, Chennai", locations);

        printTicketDetails(rt);
        printTicketDetails(tt);

        tt.removeLastTouristLocation();
        tt.addTouristLocation("Banga");
        System.out.println(tt.getTouristLocations()[0]);
        System.out.println(tt.getTouristLocations()[1]);
        System.out.println(tt.getTouristLocations()[2]);
        System.out.println(tt.getTouristLocations()[3]);
    }

    private static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPNR());
    }
}
