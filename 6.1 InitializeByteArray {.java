public class InitializeByteArray {
    public static void main(String[] args) {
        byte[] values = new byte[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }
        // Optionally print the array to verify it's initialized correctly
        for (byte val : values) {
            System.out.print(val + " ");
        }
    }
}
