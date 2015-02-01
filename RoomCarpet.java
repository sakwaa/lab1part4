// Sakwa Alvitre
// Lab1Part4

public class RoomCarpet {
    protected RoomDimension roomDimension;
    protected double carpetCost;
    
    public RoomCarpet(RoomDimension roomDimension, double cost) {
        this.roomDimension = roomDimension;
        this.carpetCost = cost;
    }
    protected double getTotalCost() {
        return this.roomDimension.getArea() * this.carpetCost;
    }
}