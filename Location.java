
public class Location {
    // contains a x-coordinate and a y-coordinate
    int x;
    int y;

    // constructor
    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString() method
    @Override
    public String toString() {
        return "<" + x + ", " + y + ">";
    }
}
