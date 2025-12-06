package version5;

public class Car extends Vehicle {
    private boolean isElectric;
    private int numberOfSeats;

    public Car(String type, String name, String model, String color, int year, String licensePlate, boolean isElectric, int numberOfSeats, Owner owner, Insurance insurance) {
        super(type, name, model, color, year, licensePlate, owner, insurance);
        this.isElectric = isElectric;
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String display() {
        return super.display() + ", Electric: " + isElectric + ", Number of Seats: " + numberOfSeats;
    }


}
