import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of people
        System.out.print("Enter the number of people signed up for the field trip: ");
        int people = scanner.nextInt();

        // A bus holds 45 people
        int busCapacity = 45;

        // Calculate the number of buses needed
        int busesNeeded = people / busCapacity;
        int peopleInVans = people % busCapacity;

        // Print the results
        System.out.println("Number of buses needed: " + busesNeeded);
        System.out.println("Number of people that need to ride in vans: " + peopleInVans);
    }
}
