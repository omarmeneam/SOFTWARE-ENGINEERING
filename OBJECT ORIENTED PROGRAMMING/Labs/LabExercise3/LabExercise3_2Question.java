/*
LAB EXERCISE 3_2
SEMESTER II 2023/2024
SUBJECT CODE : SECJ2154
SUBJECT NAME : OBJECT ORIENTED PROGRAMMING
Omar Abdelaziz, A22EC4012, section 11

Objective:
1. Output should be like below:
Animal Information:
Animal 1:
Species: Dog
Age: 3

Animal 2:
Species: Cat
Age: 5

Animal 3:
Species: Bird
Age: 2
 */

class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}

public class LabExercise3_2Question {
    public static void main(String[] args) {
        // Create an array of Animal objects with the specified size
        Animal[] animals = new Animal[3];

        // Initialize each element of the array with Animal objects
        animals[0] = new Animal("Dog", 3);
        animals[1] = new Animal("Cat", 5);
        animals[2] = new Animal("Bird", 2);

        // Display information of each animal
        System.out.println("Animal Information:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            System.out.println("Species: " + animals[i].getSpecies());
            System.out.println("Age: " + animals[i].getAge());
            System.out.println();
        }
    }
}
