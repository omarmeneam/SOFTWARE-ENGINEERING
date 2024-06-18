/* 
 *Name: Omar Abdelmoneam Hanafy
 *Matric: A22EC4012
 *Date: 17 April 2024
*/

package myPackage; // Package declaration indicating the file's location

public class Students {
    private static int totalStudents = 0;
    private int studentId;
    private String firstName;
    private String lastName;
    private double gpa;

    public Students(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.studentId = ++totalStudents;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static Students compareGPA(Students student1, Students student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return student1;
        } else {
            return student2;
        }
    }
}
