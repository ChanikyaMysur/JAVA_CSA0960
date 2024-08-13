import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("a. Enter Matrix A");
            System.out.println("b. Enter Matrix B");
            System.out.println("c. Display A + B");
            System.out.println("d. Display A - B");
            System.out.println("e. Display A * B");
            System.out.println("f. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    enterMatrix(scanner, matrixA, 'A');
                    break;
                case 'b':
                    enterMatrix(scanner, matrixB, 'B');
                    break;
                case 'c':
                    displayMatrix(addMatrices(matrixA, matrixB));
                    break;
                case 'd':
                    displayMatrix(subtractMatrices(matrixA, matrixB));
                    break;
                case 'e':
                    displayMatrix(multiplyMatrices(matrixA, matrixB));
                    break;
                case 'f':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 'f');
    }

    private static void enterMatrix(Scanner scanner, int[][] matrix, char matrixName) {
        System.out.println("Enter values for Matrix " + matrixName + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][0] * matrixB[0][j] + matrixA[i][1] * matrixB[1][j];
            }
        }
        return result;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
