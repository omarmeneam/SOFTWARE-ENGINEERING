/*
LAB EXERCISE 3_1
SEMESTER II 2023/2024
SUBJECT CODE : SECJ2154
SUBJECT NAME : OBJECT ORIENTED PROGRAMMING
Omar Abdelaziz, A22EC4012, section 11

Objective:
1. Output should be like below (Displaying the values directly will not be accepted, use the for loops provided):
Multiplication Table:
   1   2   3   4   5   6   7   8   9  10
   2   4   6   8  10  12  14  16  18  20
   3   6   9  12  15  18  21  24  27  30
   4   8  12  16  20  24  28  32  36  40
   5  10  15  20  25  30  35  40  45  50
   6  12  18  24  30  36  42  48  54  60
   7  14  21  28  35  42  49  56  63  70
   8  16  24  32  40  48  56  64  72  80
   9  18  27  36  45  54  63  72  81  90
  10  20  30  40  50  60  70  80  90 100
 */

public class LabExercise3_1Question {
    public static void main(String[] args) {
        int size = 10; // Assign the size of the multiplication table to an int variable

        // Create a 2D array to store the multiplication table
        int[][] multiplicationTable = new int[size][size];

        // Populate the multiplication table
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1); // Do the operation to produce and assign the required
                                                               // values as in the objective to each element
            }
        }

        // Display the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]); // Note: printf and %4d is used to align the output
                                                                     // as in the objective
            }
            System.out.println();
        }
    }
}
