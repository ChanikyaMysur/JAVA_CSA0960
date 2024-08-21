public class GenericMethodExample {

    // Generic method that prints elements of an array
    public <T> void printArray(T[] array) {
        for (T arrayItem : array) {
            System.out.println(arrayItem);
        }
    }

    public static void main(String[] args) {
        GenericMethodExample gmc = new GenericMethodExample();

        // Create arrays of different types
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This", "is", "fun"};

        // Print arrays using the generic method
        System.out.println("Integer Array:");
        gmc.printArray(integerArray);

        System.out.println("\nString Array:");
        gmc.printArray(stringArray);
    }
}
