public class Student {
    private String name;
    private int credits;
    private double gpa;
    private int qualityPoints;

    // Constructor
    public Student(String name, int credits, int qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = (double) qualityPoints / credits;
    }

    // Method to return GPA
    public double getGPA() {
        return gpa;
    }

    // Method to update credits, quality points, and GPA
    public void updateSemester(int newCredits, int newQualityPoints) {
        credits += newCredits;
        qualityPoints += newQualityPoints;
        gpa = (double) qualityPoints / credits;
    }
}
