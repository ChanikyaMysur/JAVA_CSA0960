public class StringExample {
    public static void main(String[] args) {
        // Method 1: Using String literal
        String myString1 = "abc";

        // Method 2: Using the new keyword
        String myString2 = new String("abc");

        // Method 3: Using a char array
        char[] charArray = {'a', 'b', 'c'};
        String myString3 = new String(charArray);

        // Print the strings to verify
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);
    }
}
