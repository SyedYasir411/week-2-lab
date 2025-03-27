import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available \n"));
    }
}

public class P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie name:");
        String movie = input.nextLine();
        System.out.println("Enter seat number:");
        int seat = input.nextInt();
        System.out.println("Enter ticket price:");
        double price = input.nextDouble();
        MovieTicket ticket = new MovieTicket(movie, seat, price);
        ticket.displayTicket();
        ticket.book();
        ticket.displayTicket();
        input.close();
    }
}
