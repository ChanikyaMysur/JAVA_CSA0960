import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        int rockCount = 0, paperCount = 0, scissorsCount = 0;

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(3);  // generates a random number in the range 0 to 2
            
            switch (number) {
                case 0:
                    System.out.println("rock");
                    rockCount++;
                    break;
                case 1:
                    System.out.println("paper");
                    paperCount++;
                    break;
                case 2:
                    System.out.println("scissors");
                    scissorsCount++;
                    break;
            }
        }

        System.out.println("\nSimulation Results:");
        System.out.println("Rock: " + rockCount);
        System.out.println("Paper: " + paperCount);
        System.out.println("Scissors: " + scissorsCount);
    }
}
