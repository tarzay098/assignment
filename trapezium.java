import java.util.Scanner;
//Question6

public class trapezium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first parallel side: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of the second parallel side: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double h = scanner.nextDouble();

        double area = 0.5 * (a + b) * h;

        System.out.println("The area of the trapezium is: " + area);

        scanner.close();
    System.out.println("Love coding <3 ");
    
    }
}