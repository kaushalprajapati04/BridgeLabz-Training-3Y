import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;
       
        System.out.printf("\nAverage Marks: %.2f\n", average);

        String grade, remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
        else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } 
        else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } 
        else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } 
        else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
        else {
            grade = "R";
            remarks = "Remedial standards";
        }
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}

