public class MathFormulas {
    public static void main(String[] args) {
        // Assuming x, y, and z are already declared and initialized
        double x = 5, y = 3, z = 2;

        // a = sqrt(x^5 - 6) / 4
        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

        // b = x * y - 6 * x
        double b = x * y - 6 * x;

        // c = 4 * Math.cos(z / 5) - Math.sin(x^2)
        double c = 4 * Math.cos(z / 5.0) - Math.sin(Math.pow(x, 2));

        // d = x^4 - sqrt(6 * x - y^3)
        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));

        // e = 1 / (y - 1) / (x - 2 * y)
        double e = 1 / (y - 1) / (x - 2 * y);

        // f = 7 * Math.cos(Math.sqrt(5 - Math.sin(3 * x - 4)))
        double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(3 * x - 4)));

        // Print the results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
