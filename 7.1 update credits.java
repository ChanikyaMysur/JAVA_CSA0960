public class Main {
    public static void main(String[] args) {
        Student ari = new Student("Ari Samala", 31, 69);

        // Update Ari Samala's credits and quality points
        ari.updateSemester(13, 52);

        // Print updated GPA
        System.out.println("Updated GPA for Ari Samala: " + ari.getGPA());
    }
}
