package studentmarklist;

import java.util.Scanner;

public class StudentMarkList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to allow multiple calculations
        while (true) {
            // Input: Take marks obtained in each subject
            System.out.println("Enter the marks out of (100):");
            int totalMarks = 0;
            int totalSubjects;

            // Calculate Total Marks: Sum up the marks obtained in all subjects
            System.out.print("Enter the total number of subjects: ");
            totalSubjects = scanner.nextInt();

            for (int i = 1; i <= totalSubjects; i++) {
                System.out.print("Enter the mark of subject 1 " + i + ": ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }

            // Calculate Average Percentage: Divide the total marks by the total number of subjects
            double averagePercentage = (double) totalMarks / totalSubjects;

            // Grade Calculation: Assign grades based on the average percentage achieved
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display Results: Show the total marks, average percentage, and the corresponding grade
            System.out.println("\nResults:");
            System.out.println("Total: " + totalMarks);
            System.out.println("Average: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

            // Ask the user if they want to continue
            System.out.print("\nDo you want to calculate grades again? yes or no: ");
            String continueInput = scanner.next().toLowerCase();

            // Exit the loop if the user doesn't want to continue
            if (!continueInput.equals("yes")) {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}