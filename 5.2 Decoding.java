import java.util.HashMap;
import java.util.Scanner;

public class SecretMessageDecoder {
    public static void main(String[] args) {
        HashMap<Integer, Character> codeMap = new HashMap<>();
        codeMap.put(1, 'D');
        codeMap.put(2, 'W');
        codeMap.put(3, 'E');
        codeMap.put(4, 'L');
        codeMap.put(5, 'H');
        codeMap.put(6, 'O');
        codeMap.put(7, 'R');

        Scanner scanner = new Scanner(System.in);
        StringBuilder decodedMessage = new StringBuilder();
        int inputCount = 0;

        while (inputCount < 10) {
            System.out.print("Enter a number (1-7): ");
            int num = scanner.nextInt();

            if (codeMap.containsKey(num)) {
                decodedMessage.append(codeMap.get(num));
                inputCount++;
            } else {
                System.out.println("Invalid number. Please enter a number between 1 and 7.");
            }
        }

        System.out.println("Decoded message: " + decodedMessage.toString());
    }
}


