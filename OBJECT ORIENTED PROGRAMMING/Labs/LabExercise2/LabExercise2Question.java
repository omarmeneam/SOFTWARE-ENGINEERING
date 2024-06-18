/* 
 *Name: Omar Abdelmonem Hanafy
 *Matric: A22EC4012
 *Date: 17 April 2024
*/

import myPackage.Students; // Import Students class from myPackage package

public class LabExercise2Question {
    public static void main(String[] args) {
        // Create student objects
        Students student1 = new Students("John", "Doe", 3.8);
        Students student2 = new Students("Jane", "Doe", 4.0);

        // Test all accessor methods
        System.out.println("Student 1 ID: " + student1.getStudentId());
        System.out.println("Student 1 Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student 1 GPA: " + student1.getGpa());

        System.out.println("Student 2 ID: " + student2.getStudentId());
        System.out.println("Student 2 Name: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.println("Student 2 GPA: " + student2.getGpa());

        // Test all mutator methods, then print the updated info
        student1.setFirstName("Ahmed");
        student1.setLastName("Mohammed");
        student1.setGpa(3.7);

        System.out.println("Updated Student 1 Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Updated Student 1 GPA: " + student1.getGpa());

        // Compare GPAs and print the student with the higher GPA
        Students studentWithHigherGPA = Students.compareGPA(student1, student2);
        System.out.println("Student with higher GPA: " + studentWithHigherGPA.getFirstName() + " "
                + studentWithHigherGPA.getLastName());

        // Display total number of students created
        System.out.println("Total number of students created: " + Students.getTotalStudents());
    }
}
