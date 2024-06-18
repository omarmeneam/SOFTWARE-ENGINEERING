/*
LAB EXERCISE 3_3
SEMESTER II 2023/2024
SUBJECT CODE : SECJ2154
SUBJECT NAME : OBJECT ORIENTED PROGRAMMING
Omar Abdelaziz, A22EC4012, section 11

Objective:
1. Output should be like below:
Original Information of Vehicles:
Type: Car, Model: Toyota
Type: Truck, Model: Ford
Type: Motorcycle, Model: Honda

Updated Information of Vehicles:
Type: Car, Model: Toyota - 2022
Type: Truck, Model: Ford - 2022
Type: Motorcycle, Model: Honda - 2022
 */

class Vehicle {
    private String type;
    private String model;

    public Vehicle(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class LabExercise3_3Answer {
    public static void main(String[] args) {
        // Create an array of Vehicle objects
        Vehicle[] vehicles = {
                new Vehicle("Car", "Toyota"),
                new Vehicle("Truck", "Ford"),
                new Vehicle("Motorcycle", "Honda")
        };

        // Display information of all vehicles
        System.out.println("Original Information of Vehicles:");
        printVehicles(vehicles);

        // Pass the array to the updateModels method
        updateModels(vehicles);

        // Display information of vehicles after updating models
        System.out.println("\nUpdated Information of Vehicles:");
        printVehicles(vehicles);
    }

    // Method to update the models of vehicles
    public static void updateModels(Vehicle[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].setModel(arr[i].getModel() + " - 2022");
        }
    }

    // Method to print the information of vehicles
    public static void printVehicles(Vehicle[] arr) {
        for (Vehicle vehicle : arr) {
            System.out.println("Type: " + vehicle.getType() + ", Model: " + vehicle.getModel());
        }
    }
}
