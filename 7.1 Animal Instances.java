public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Animal animal1 = new Animal();

        // Using parameterized constructor
        Animal animal2 = new Animal(60, 5, 10);

        // Print the speeds
        System.out.println("Animal #1 has a speed of " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 has a speed of " + animal2.getSpeed() + ".");
    }
}
