import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 50;

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {
            availableSeats = availableSeats - tickets;
            int totalAmount = tickets * 200;

            System.out.println("Tickets Booked Successfully.");
            System.out.println("Total Amount = " + totalAmount);
            System.out.println("Remaining Seats = " + availableSeats);
        } else {
            System.out.println("Not enough seats available.");
        }

        
    }
}