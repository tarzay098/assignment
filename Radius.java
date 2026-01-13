import java.util.Scanner;

public class Radius {
//Question2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);

        System.out.println("Enter radius of the cicumference");
        double radius1 = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius1;
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}
