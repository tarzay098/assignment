import java.util.Scanner;
//Question.1
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter the maximum marks: ");
        double maximumMarks = scanner.nextDouble();

        double result = (obtainedMarks / maximumMarks) * 100;

        System.out.println("Percentage: " + result + "%");

        scanner.close();
    }
}