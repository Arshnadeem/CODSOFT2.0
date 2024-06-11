package program;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the total number of subjects:");
        int subjects = scanner.nextInt();
        int totalMarks = 0;
        System.out.println("Enter marks:");

        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculating the total Marks
        System.out.println("So, the total Marks Obtained are: " + totalMarks);

        // Calculating the average Percentage
        double averagePercentage = (double) totalMarks / subjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // getting grade
        String grade;
        
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "E";
        }

        // Display Results
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
