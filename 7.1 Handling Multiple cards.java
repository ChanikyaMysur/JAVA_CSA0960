import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Card> hand = new ArrayList<>();
        int totalPoints = 0;

        // Add first two random cards to hand
        for (int i = 0; i < 2; i++) {
            int suitNumber = rand.nextInt(4) + 1;
            int faceNumber = rand.nextInt(13) + 1;
            Card card = new Card(suitNumber, faceNumber);
            hand.add(card);
            totalPoints += card.points;
            System.out.println("Card " + (i + 1) + ": " + card);
        }

        while (totalPoints <= 21 && hand.size() < 5) {
            System.out.print("Do you want another card? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                int suitNumber = rand.nextInt(4) + 1;
                int faceNumber = rand.nextInt(13) + 1;
                Card card = new Card(suitNumber, faceNumber);
                hand.add(card);
                totalPoints += card.points;
                System.out.println("New card: " + card);
            } else {
                break;
            }
        }

        System.out.println("Your hand:");
        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println("Total points: " + totalPoints);

        if (totalPoints > 21) {
            System.out.println("Bust! Total points exceed 21.");
        }

        scanner.close();
    }
}
