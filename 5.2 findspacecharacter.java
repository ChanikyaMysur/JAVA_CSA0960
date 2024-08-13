public class FindSpaceCharacter {
    public static void main(String[] args) {
        String str = "Find the first space character";
        int index = 0;
        
        while (index < str.length()) {
            if (str.charAt(index) == ' ') {
                break; // Exit the loop when the first space character is found
            }
            index++;
        }

        if (index < str.length()) {
            System.out.println("First space character found at index: " + index);
        } else {
            System.out.println("No space character found in the string.");
        }
    }
}
