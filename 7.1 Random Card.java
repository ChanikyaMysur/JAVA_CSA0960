import java.util.Random;

public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName(int i) {
        switch (i) {
            case 1: return "Ace";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "error";
        }
    }

    public int getPoints(String n) {
        switch (n) {
            case "Jack": case "Queen": case "King": case "Ten":
                return 10;
            case "Ace":
                return 11;
            default:
                return Integer.parseInt(n);
        }
    }

    public String getSuit(int i) {
        switch (i) {
            case 1: return "Diamonds";
            case 2: return "Clubs";
            case 3: return "Spades";
            case 4: return "Hearts";
            default: return "error";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int suitNumber1 = rand.nextInt(4) + 1;
        int faceNumber1 = rand.nextInt(13) + 1;
        Card card1 = new Card(suitNumber1, faceNumber1);

        int suitNumber2 = rand.nextInt(4) + 1;
        int faceNumber2 = rand.nextInt(13) + 1;
        Card card2 = new Card(suitNumber2, faceNumber2);

        System.out.println(card1);
        System.out.println(card2);

        System.out.println("Total points for both cards: " + (card1.points + card2.points));
    }
}
