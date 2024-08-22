// Enum class for BikeUses
public enum BikeUses {
    OFF_ROAD,
    TRACK,
    ROAD,
    DOWNHILL,
    TRAIL
}

// MountainParts Interface
interface MountainParts {
    BikeUses terrain = BikeUses.OFF_ROAD; // Updated to use Enum

    // Example methods
    String getSuspension();

    int getFrameSize();
}

// RoadParts Interface
interface RoadParts {
    BikeUses terrain = BikeUses.TRACK; // Updated to use Enum

    // Example methods
    String getHandlebars();

    int getGears();
}

// Bike superclass
abstract class Bike {
    String brand;
    int gears;

    public Bike(String brand, int gears) {
        this.brand = brand;
        this.gears = gears;
    }

    // Other methods...
    public abstract String toString();
}

// MountainBike subclass
class MountainBike extends Bike implements MountainParts {
    private String suspension;
    private int frameSize;

    public MountainBike(String brand, int gears, String suspension, int frameSize) {
        super(brand, gears);
        this.suspension = suspension;
        this.frameSize = frameSize;
    }

    @Override
    public String getSuspension() {
        return suspension;
    }

    @Override
    public int getFrameSize() {
        return frameSize;
    }

    @Override
    public String toString() {
        return brand + " Cycles\n" +
                "This mountain bike has " + gears + " gears.\n" +
                "It has a " + suspension + " suspension and a frame size of " + frameSize + " inches.\n" +
                "This bike is best for " + MountainParts.terrain.toString().toLowerCase();
    }
}

// RoadBike subclass
class RoadBike extends Bike implements RoadParts {
    private String handlebars;

    public RoadBike(String brand, int gears, String handlebars) {
        super(brand, gears);
        this.handlebars = handlebars;
    }

    @Override
    public String getHandlebars() {
        return handlebars;
    }

    @Override
    public int getGears() {
        return gears;
    }

    @Override
    public String toString() {
        return brand + " Cycles\n" +
                "This road bike has " + handlebars + " handlebars and " + gears + " gears.\n" +
                "This bike is best for " + RoadParts.terrain.toString().toLowerCase();
    }
}

// Driver class to run the program
public class BikeProject {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("Oracle", 27, "RockShox XC32", 19);
        RoadBike roadBike = new RoadBike("Oracle", 18, "Bull Horn");

        System.out.println(mountainBike);
        System.out.println();
        System.out.println(roadBike);
    }
}
