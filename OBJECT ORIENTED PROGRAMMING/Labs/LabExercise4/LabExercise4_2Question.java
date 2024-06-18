/*
LAB EXERCISE 4_2
SEMESTER II 2023/2024
SUBJECT CODE : SECJ2154
SUBJECT NAME : OBJECT ORIENTED PROGRAMMING

Name : Omar Abdelmonem Hanafy
Matric No : A22EC4012
Section : 11

Objective:
1. Output should be like below (Displaying the values directly will not be accepted):
Engine started.
Car started.
Entered room.
Entered house.
 */

// Parent class
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

// Aggregation
class Car111 {
    private Engine engine; // Declares a private member variable named engine of type Engine

    public Car111(Engine engine) {
        this.engine = engine; // Assigns the Engine object passed to the constructor to the engine member
                              // variable of the Car object
    }

    public void startCar() {
        engine.start(); // Calls the start() method of the Engine object associated with the Car
        System.out.println("Car started.");
    }
}

// Composition
class House {
    private Room room; // Declares a private member variable named room of type Room

    public House() {
        this.room = new Room(); // Instantiates a new Room object and assigns it to the room member variable of
                                // the House object
    }

    public void enterHouse() {
        room.enter(); // Calls the enter() method of the Room object associated with the House
        System.out.println("Entered house.");
    }
}

class Room {
    public void enter() {
        System.out.println("Entered room.");
    }
}

public class LabExercise4_2Question {
    public static void main(String[] args) {
        // Aggregation example
        Engine engine = new Engine();
        Car111 car = new Car111(engine);
        car.startCar();

        // Composition example
        House house = new House();
        house.enterHouse();
    }
}
