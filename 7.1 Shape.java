public class Shape {
    private int numSides;
    private boolean regular;

    // Default constructor
    public Shape() {
        this.numSides = 0;
        this.regular = false;
    }

    // Parameterized constructor
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter for numSides
    public int getNumSides() {
        return numSides;
    }

    // Setter for numSides
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter for regular
    public boolean isRegular() {
        return regular;
    }

    // Setter for regular
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}
