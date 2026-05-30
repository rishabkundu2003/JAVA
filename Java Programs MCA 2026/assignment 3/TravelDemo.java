package travel.flights;

public class Flight {
    private String flightNumber;
    private String destination;
    private double price;

    public Flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public String getDetails() {
        return "Flight Number: " + flightNumber +
               "\nDestination: " + destination +
               "\nPrice: ₹" + price;
    }
}
package travel.hotels;

public class Hotel {
    private String hotelName;
    private String location;
    private double price;

    public Hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    public String getDetails() {
        return "Hotel Name: " + hotelName +
               "\nLocation: " + location +
               "\nPrice: ₹" + price;
    }
}
package travel.bookings;

import travel.flights.Flight;
import travel.hotels.Hotel;

public class Booking {

    public void bookFlight(Flight f) {
        System.out.println("\n----- Flight Booking Details -----");
        System.out.println(f.getDetails());
    }

    public void bookHotel(Hotel h) {
        System.out.println("\n----- Hotel Booking Details -----");
        System.out.println(h.getDetails());
    }
}
package travel.bookings;

import travel.flights.Flight;
import travel.hotels.Hotel;

public class TravelDemo {

    public static void main(String[] args) {

        try {
            Flight flight = new Flight(
                    "AI101",
                    "Delhi",
                    8500);

            Hotel hotel = new Hotel(
                    "Taj Palace",
                    "Delhi",
                    6000);

            Booking booking = new Booking();

            booking.bookFlight(flight);
            booking.bookHotel(hotel);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
