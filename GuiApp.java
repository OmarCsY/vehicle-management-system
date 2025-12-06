package version5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiApp<T extends Vehicle> extends JFrame implements ActionListener {

    private JPanel p1 = new JPanel();


    private JPanel p2 = new JPanel();

    private JLabel management = new JLabel("Vehicle management");


    private JPanel p3 = new JPanel();

    private JButton addCarButton = new JButton("Add Car");

    private JButton showCars = new JButton("Show Cars");

    private JButton showTrucks = new JButton("Show Trucks");

    private JButton addTruckButton = new JButton("Add Truck");

    private JButton showVehicles = new JButton("Show Vehicles");


    private ArrayList<Car> cars = new ArrayList<>();

    private ArrayList<Truck> trucks = new ArrayList<>();

    private ArrayList<T> vehicles = new ArrayList<>();




    public GuiApp(){

        setLayout(new GridLayout(3, 1));


        p2.setLayout(new FlowLayout());

        p2.add(management);

        p3.setLayout(new BorderLayout(10, 0));

        p3.add(addCarButton, BorderLayout.EAST);

        p3.add(showCars, BorderLayout.SOUTH);

        p3.add(showVehicles, BorderLayout.CENTER);

        p3.add(showTrucks, BorderLayout.NORTH);

        p3.add(addTruckButton, BorderLayout.WEST);


        add(p1);

        add(p2);

        add(p3);

        addCarButton.addActionListener(this);

        showCars.addActionListener(this);

        showVehicles.addActionListener(this);

        showTrucks.addActionListener(this);

        addTruckButton.addActionListener(this);


        setTitle("Vehicle managment");

        setSize(500, 300);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getActionCommand().equals("Add Car")){
            try {
                // Info Car
                String typeCar = isString(JOptionPane.showInputDialog(this, "Enter type car: ", "type"));

                String nameCar = isString(JOptionPane.showInputDialog(this, "Enter name car: ", "name"));

                String modelCar = isString(JOptionPane.showInputDialog(this, "Enter model car: ", "model"));

                String colorCar = isString(JOptionPane.showInputDialog(this, "Enter color car: ", "color"));

                int yearCar = isInt(JOptionPane.showInputDialog(this, "Enter car year: ", "year"));

                String licensePlateCar = isString(JOptionPane.showInputDialog(this, "Enter license plate car: ", "license plate"));

                int electricTest = JOptionPane.showConfirmDialog(this, "Is the car electric?", "Electric Car", JOptionPane.YES_NO_OPTION);

                boolean isElectricCar = (electricTest == JOptionPane.YES_OPTION);

                int numberOfSeatsCar = isInt(JOptionPane.showInputDialog(this, "Enter number of seats: ", "seats"));


                // Info Owner
                String ownerName = isString(JOptionPane.showInputDialog(this, "Enter owner name: ", "name"));

                String ownerAddress = isString(JOptionPane.showInputDialog(this, "Enter owner address: ", "address"));

                String ownerPhoneNumber = isString(JOptionPane.showInputDialog(this, "Enter owner phone number: ", "phone number"));

                Owner owner = new Owner(ownerName, ownerAddress, ownerPhoneNumber);


                // Info Insurance
                String insuranceCompanyName = isString(JOptionPane.showInputDialog(this, "Enter insurance company name: ", "company name"));

                String insurancePolicyNumber = isString(JOptionPane.showInputDialog(this, "Enter insurance policy number: ", "policy number"));

                String insuranceExpirationDate = isString(JOptionPane.showInputDialog(this, "Enter insurance expiration date: ", "expiration date"));

                Insurance insurance = new Insurance(insuranceCompanyName, insurancePolicyNumber, insuranceExpirationDate);

                Car car = new Car(typeCar, nameCar, modelCar, colorCar, yearCar, licensePlateCar, isElectricCar, numberOfSeatsCar, owner, insurance);

                cars.add(car);

                vehicles.add((T) car);


            }catch (Exception exception){
                JOptionPane.showMessageDialog(this, "Invalid input: "+ exception.getMessage());
            }
        }

        if(e.getActionCommand().equals("Add Truck")) {

            try {
                // Info Truck
                String typeTruck = isString(JOptionPane.showInputDialog(this, "Enter type truck: ", "type"));

                String nameTruck = isString(JOptionPane.showInputDialog(this, "Enter name truck: ", "name"));

                String modelTruck = isString(JOptionPane.showInputDialog(this, "Enter model truck: ", "model"));

                String colorTruck = isString(JOptionPane.showInputDialog(this, "Enter color truck: ", "color"));

                int yearTruck = isInt(JOptionPane.showInputDialog(this, "Enter truck year: ", "year"));

                String licensePlateTruck = isString(JOptionPane.showInputDialog(this, "Enter license plate truck: ", "license plate"));

                int maxLoadWeightTruck = isInt(JOptionPane.showInputDialog(this, "Enter truck max load weight: ", "max load weight"));


                // Info Owner
                String ownerName = isString(JOptionPane.showInputDialog(this, "Enter owner name: ", "name"));

                String ownerAddress = isString(JOptionPane.showInputDialog(this, "Enter owner address: ", "address"));

                String ownerPhoneNumber = isString(JOptionPane.showInputDialog(this, "Enter owner phone number: ", "phone number"));

                Owner owner = new Owner(ownerName, ownerAddress, ownerPhoneNumber);

                // Info Insurance
                String insuranceCompanyName = isString(JOptionPane.showInputDialog(this, "Enter insurance company name: ", "company name"));

                String insurancePolicyNumber = isString(JOptionPane.showInputDialog(this, "Enter insurance policy number: ", "policy number"));

                String insuranceExpirationDate = isString(JOptionPane.showInputDialog(this, "Enter insurance expiration date: ", "expiration date"));

                Insurance insurance = new Insurance(insuranceCompanyName, insurancePolicyNumber, insuranceExpirationDate);

                Truck truck = new Truck(typeTruck, nameTruck, modelTruck, colorTruck, yearTruck, licensePlateTruck, maxLoadWeightTruck, owner, insurance);

                trucks.add(truck);

                vehicles.add((T) truck);



            } catch (Exception exception){
                JOptionPane.showMessageDialog(this, "Invalid input: " + exception.getMessage());
            }
        }


        if (e.getActionCommand().equals("Show Cars")){

            if (cars.isEmpty()){
                JOptionPane.showMessageDialog(this, "No cars available.");

            } else {
                StringBuilder carsInfo = new StringBuilder("Cars available:\n\n");
                int counterCars = 1;
                for (Car car : cars) {
                    carsInfo.append("Car number: ").append(counterCars).append("\n")
                            .append("Type: ").append(car.getType()).append("\n")
                            .append("Name: ").append(car.getName()).append("\n")
                            .append("Model: ").append(car.getModel()).append("\n")
                            .append("Color: ").append(car.getColor()).append("\n")
                            .append("Year: ").append(car.getYear()).append("\n")
                            .append("License Plate: ").append(car.getLicensePlate()).append("\n")
                            .append("Electric: ").append(car.isElectric() ? "Yes" : "No").append("\n")
                            .append("Seats: ").append(car.getNumberOfSeats()).append("\n")
                            .append("Owner name: ").append(car.getOwner().getName()).append("\n")
                            .append("Owner address: ").append(car.getOwner().getAddress()).append("\n")
                            .append("Owner phone number: ").append(car.getOwner().getPhoneNumber()).append("\n")
                            .append("Insurance company name: ").append(car.getInsurance().getCompanyName()).append("\n")
                            .append("Insurance policy number: ").append(car.getInsurance().getPolicyNumber()).append("\n")
                            .append("Insurance expiration date: ").append(car.getInsurance().getExpirationDate()).append("\n")
                            .append("********************************\n");
                            counterCars++;
                }

                JOptionPane.showMessageDialog(this, carsInfo.toString(), "Cars Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getActionCommand().equals("Show Trucks")) {

            if (trucks.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No trucks available.");

            } else {

                StringBuilder trucksInfo = new StringBuilder("Trucks available:\n\n");

                int counterTrucks = 1;
                for (Truck truck : trucks) {
                    trucksInfo.append("Truck number: ").append(counterTrucks).append("\n")
                            .append("Type: ").append(truck.getType()).append("\n")
                            .append("Model: ").append(truck.getModel()).append("\n")
                            .append("Color: ").append(truck.getColor()).append("\n")
                            .append("Year: ").append(truck.getYear()).append("\n")
                            .append("License plate: ").append(truck.getLicensePlate()).append("\n")
                            .append("Max load weight: ").append(truck.getMaxLoadWeight()).append("\n")
                            .append("Owner name: ").append(truck.getOwner().getName()).append("\n")
                            .append("Owner address: ").append(truck.getOwner().getAddress()).append("\n")
                            .append("Owner phone number: ").append(truck.getOwner().getPhoneNumber()).append("\n")
                            .append("Insurance company name: ").append(truck.getInsurance().getCompanyName()).append("\n")
                            .append("Insurance policy number: ").append(truck.getInsurance().getPolicyNumber()).append("\n")
                            .append("Insurance expiration date: ").append(truck.getInsurance().getExpirationDate()).append("\n")
                            .append("**************************************\n");
                            counterTrucks++;
                }

                JOptionPane.showMessageDialog(this, trucksInfo.toString(), "Cars Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(e.getActionCommand().equals("Show Vehicles")){
            if(vehicles.isEmpty()){
                JOptionPane.showMessageDialog(this, "No vehicles available.");
            } else{
                StringBuilder vehiclesInfo = new StringBuilder("Vehicles available\n\n");

                int counterVehicle = 1;

                for (Car car : cars) {
                    vehiclesInfo.append("Vehicle number: ").append(counterVehicle).append("\n")
                            .append("Type vehicle: Car\n")
                            .append("Type: ").append(car.getType()).append("\n")
                            .append("Name: ").append(car.getName()).append("\n")
                            .append("Model: ").append(car.getModel()).append("\n")
                            .append("Color: ").append(car.getColor()).append("\n")
                            .append("Year: ").append(car.getYear()).append("\n")
                            .append("License Plate: ").append(car.getLicensePlate()).append("\n")
                            .append("Electric: ").append(car.isElectric() ? "Yes" : "No").append("\n")
                            .append("Seats: ").append(car.getNumberOfSeats()).append("\n")
                            .append("Owner name: ").append(car.getOwner().getName()).append("\n")
                            .append("Owner address: ").append(car.getOwner().getAddress()).append("\n")
                            .append("Owner phone number: ").append(car.getOwner().getPhoneNumber()).append("\n")
                            .append("Insurance company name: ").append(car.getInsurance().getCompanyName()).append("\n")
                            .append("Insurance policy number: ").append(car.getInsurance().getPolicyNumber()).append("\n")
                            .append("Insurance expiration date: ").append(car.getInsurance().getExpirationDate()).append("\n")
                            .append("********************************\n");
                            counterVehicle++;
                }

                for (Truck truck : trucks) {
                    vehiclesInfo.append("vehicle number: ").append(counterVehicle).append("\n")
                            .append("Type vehicle: Truck\n")
                            .append("Type: ").append(truck.getType()).append("\n")
                            .append("Model: ").append(truck.getModel()).append("\n")
                            .append("Color: ").append(truck.getColor()).append("\n")
                            .append("Year: ").append(truck.getYear()).append("\n")
                            .append("License plate: ").append(truck.getLicensePlate()).append("\n")
                            .append("Max load weight: ").append(truck.getMaxLoadWeight()).append("\n")
                            .append("Owner name: ").append(truck.getOwner().getName()).append("\n")
                            .append("Owner address: ").append(truck.getOwner().getAddress()).append("\n")
                            .append("Owner phone number: ").append(truck.getOwner().getPhoneNumber()).append("\n")
                            .append("Insurance company name: ").append(truck.getInsurance().getCompanyName()).append("\n")
                            .append("Insurance policy number: ").append(truck.getInsurance().getPolicyNumber()).append("\n")
                            .append("Insurance expiration date: ").append(truck.getInsurance().getExpirationDate()).append("\n")
                            .append("**************************************\n");
                            counterVehicle++;
                }

                JOptionPane.showMessageDialog(this, vehiclesInfo.toString(), "Vehicles Information", JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }



    public String isString(String input) {
        while (input == null || input.isEmpty()) {
            input = JOptionPane.showInputDialog(null, "Input cannot be empty, try again: ");
        }
        return input;
    }

    public static int isInt(String input) {
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                input = JOptionPane.showInputDialog(null, "Invalid input, please enter a valid number: ");
            }
        }
    }


    public static void main(String[] args) {
        new GuiApp();
    }
}
