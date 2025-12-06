package version5;

public class Vehicle {
    private String type;
    private String name;
    private String model;
    private String color;
    private int year;
    private String licensePlate;
    private Owner owner;
    private Insurance insurance;

    public Vehicle(String type, String name, String model, String color, int year, String licensePlate, Owner owner, Insurance insurance) {
        this.type = type;
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.insurance = insurance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String display() {
        return "Type: " + type + ", Name: " + name + ", Model: " + model + ", Color: " + color + ", Year: " + year +
                ", License Plate: " + licensePlate + "\nOwner: " + owner.displayOwner() + "\nInsurance: " + insurance.displayInsurance();
    }
}
