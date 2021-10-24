public class Passenger {
    private static int idCounter = 0;
    private Address address;
    private Contact contact;
    private int passengerId;

    public Passenger(String name, String phone, String email, String street, String city, String state){
        this.contact = new Contact(name, phone, email);
        this.address = new Address(street, city, state);
        this.passengerId = ++this.idCounter;
    }

    public int getPassengerCount(){
        return this.idCounter;
    }

    public int getPassengerId() {
        return this.passengerId;
    }

    public String getContact() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    public String getAddress() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public void updateContact(String name, String phone, String email) {
        this.contact.name = name;
        this.contact.phone = phone;
        this.contact.email = email;
    }

    public void updateAddress(String street, String city, String state){
        this.address.street = street;
        this.address.city = city;
        this.address.state = state;
    }


    private static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

    }

    private static class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }



}
