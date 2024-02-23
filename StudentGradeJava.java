import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        
        double average = calculateAverage(grades);
        int highestGrade = calculateHighestGrade(grades);
        int lowestGrade = calculateLowestGrade(grades);

        
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    }

    
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    
    private static int calculateHighestGrade(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

   
    private static int calculateLowestGrade(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}

