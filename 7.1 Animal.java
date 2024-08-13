public class Animal {
    public static void main(String[] args)
    *int weight, height;*
    *double speed;*

    [Animal() {
        weight = 50;
        height = 4;
        speed = 2; //miles per hour
    }]

    [Animal(int w, int h, int s ) {
        weight = w;
        height = h; // was 'h = height'
        speed = s; // missing semicolon
    }]

    ◊public double getTime(double miles) { //gets the number of hours to go these miles
        return miles / speed;
    }◊

    ◊public int getWeight() {
        return weight;
    }◊

    ◊public int getHeight() {
        return height;
    }◊

    ◊public double getSpeed() {
        return speed;
    }◊
}
}