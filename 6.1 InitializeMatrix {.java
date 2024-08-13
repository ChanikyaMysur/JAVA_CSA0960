public class InitializeMatrix {
    public static void main(String[] args) {
        long[][] matrix = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };
        // Optionally print the matrix to verify it's initialized correctly
        for (long[] row : matrix) {
            for (long val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
