/*
LAB EXERCISE 4_1
SEMESTER II 2023/2024
SUBJECT CODE : SECJ2154
SUBJECT NAME : OBJECT ORIENTED PROGRAMMING

Name : Omar Abdelmonem Hanafy
Matric No : A22EC4012
Section : 11

Objective:
1. Output should be like below (Displaying the values directly will not be accepted):
Driving the Generic Train train
Driving the Express passenger train with 200 passengers
Stopping the Express passenger train at station
Driving the Cargo freight train with cargo capacity of 500 tons
Loading cargo onto the Cargo freight train
 */

// Parent class
class Train {
    protected String brand;

    // Defines a constructor for the Train class that takes a String parameter
    // brand.
    // Inside the constructor, the brand member variable is initialized with the
    // value passed as an argument.
    public Train(String brand) {
        this.brand = brand;
    }

    // Defines a method named drive() that prints a message according to the given
    // output above
    public void drive() {
        System.out.println("Driving the " + brand + " train");
    }
}

// Child class PassengerTrain inheriting from Train
class PassengerTrain extends Train {
    private int numOfPassengers;

    // Defines a constructor for the PassengerTrain class that takes two parameters:
    // brand and numOfPassengers
    // Inside the constructor, the superclass constructor is called to initialize
    // the brand member variable inherited from the Train class
    // Additionally, the numOfPassengers member variable is initialized with the
    // passed value
    public PassengerTrain(String brand, int numOfPassengers) {
        super(brand);
        this.numOfPassengers = numOfPassengers;
    }

    // Defines a method named drive() that overrides the drive() method of the
    // superclass (Train) that prints a message according to the given output above
    @Override
    public void drive() {
        System.out.println("Driving the " + brand + " passenger train with " + numOfPassengers + " passengers");
    }

    public void stopAtStation() {
        System.out.println("Stopping the " + brand + " passenger train at station");
    }
}

// Another child FreightTrain inheriting from PassengerTrain
class FreightTrain extends PassengerTrain {
    private int cargoCapacity;

    // Defines a constructor for the FreightTrain class that takes three parameters:
    // brand, numOfPassengers, and cargoCapacity
    // Inside the constructor, the superclass constructor is called to initialize
    // the brand and numOfPassengers member variables inherited from the
    // PassengerTrain class
    // Additionally, the cargoCapacity member variable is initialized with the
    // passed value
    public FreightTrain(String brand, int numOfPassengers, int cargoCapacity) {
        super(brand, numOfPassengers);
        this.cargoCapacity = cargoCapacity;
    }

    // Defines a method named drive() that overrides the drive() method of the
    // superclass (PassengerTrain) that prints a message according to the given
    // output above
    @Override
    public void drive() {
        System.out.println("Driving the " + brand + " freight train with cargo capacity of " + cargoCapacity + " tons");
    }

    public void loadCargo() {
        System.out.println("Loading cargo onto the " + brand + " freight train");
    }
}

public class LabExercise4_1Question {
    public static void main(String[] args) {
        Train train = new Train("Generic Train");
        train.drive();

        PassengerTrain passengerTrain = new PassengerTrain("Express", 200);
        passengerTrain.drive();
        passengerTrain.stopAtStation();

        FreightTrain freightTrain = new FreightTrain("Cargo", 0, 500);
        freightTrain.drive();
        freightTrain.loadCargo();
    }
}
