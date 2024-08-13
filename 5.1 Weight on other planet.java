import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth: ");
        double earthWeight = scanner.nextDouble();

        System.out.println("Choose a planet:");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");

        int choice = scanner.nextInt();
        double conversionFactor;

        switch (choice) {
            case 1:
                conversionFactor = 0.38;
                break;
            case 2:
                conversionFactor = 0.91;
                break;
            case 3:
                conversionFactor = 0.38;
                break;
            case 4:
                conversionFactor = 2.36;
                break;
            case 5:
                conversionFactor = 0.92;
                break;
            case 6:
                conversionFactor = 0.89;
                break;
            case 7:
                conversionFactor = 1.13;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        double planetWeight = earthWeight * conversionFactor;
        System.out.println("Your weight on the chosen planet is: " + planetWeight + " lbs.");
    }
}
