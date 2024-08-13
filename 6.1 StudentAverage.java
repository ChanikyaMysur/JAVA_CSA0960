import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testScores = new int[5];
        int total = 0;

        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
            total += testScores[i];
        }

        double average = total / 5.0;
        System.out.println("The average test score is: " + average);
    }
}
