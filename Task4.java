import java.util.Scanner;
public class TrainReservation {
    static int totalSeats = 10;
    static int bookedSeats = 0;
    static int[] tickets = new int[10]; // stores seat numbers
    static int ticketId = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== TRAIN TICKET RESERVATION SYSTEM =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Bookings");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available Seats: " + (totalSeats - bookedSeats));
                    break;
                case 2:
                    if (bookedSeats < totalSeats) {
                        System.out.print("Enter number of tickets to book: ");
                        int n = sc.nextInt();
                        if (n <= (totalSeats - bookedSeats)) {
                            for (int i = 0; i < n; i++) {
                                tickets[bookedSeats] = ticketId++;
                                bookedSeats++;
                            }
                            System.out.println(n + " ticket(s) booked successfully!");
                        } else {
                            System.out.println("Not enough seats available!");
                        }
                    } else {
                        System.out.println("All seats are booked!");
                    }
                    break;
                case 3:
                    if (bookedSeats > 0) {
                        System.out.print("Enter number of tickets to cancel: ");
                        int n = sc.nextInt();
                        if (n <= bookedSeats) {
                            bookedSeats -= n;
                            System.out.println(n + " ticket(s) cancelled successfully!");
                        } else {
                            System.out.println("Invalid cancellation request!");
                        }
                    } else {
                        System.out.println("No bookings to cancel!");
                    }
                    break;
                case 4:
                    if (bookedSeats == 0) {
                        System.out.println("No tickets booked yet.");
                    } else {
                        System.out.println("Booked Tickets:");
                        for (int i = 0; i < bookedSeats; i++) {
                            System.out.println("Ticket ID: " + tickets[i]);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting system... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
