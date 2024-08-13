public class Main {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

       
        System.out.println("Initial GPA for Ari Samala: " + ari.getGPA());
    }
}
