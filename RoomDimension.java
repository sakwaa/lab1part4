// Sakwa Alvitre
// Lab1 Part4

public class RoomDimension {
    protected double length;
    protected double width;
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }
    protected double getArea() {
        return this.length*this.width;
    }
}