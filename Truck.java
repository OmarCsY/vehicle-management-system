package version5;

public class Truck extends Vehicle {
    private int maxLoadWeight;

    public Truck(String type, String name, String model, String color, int year, String licensePlate,  int maxLoadWeight, Owner owner, Insurance insurance) {
        super(type, name, model, color, year, licensePlate, owner, insurance);
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    @Override
    public String display() {
        return super.display() + ", Max Load Weight: " + maxLoadWeight + " kg";
    }
}
