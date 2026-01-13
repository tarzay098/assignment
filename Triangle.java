import java.util.Scanner;

public class Triangle {
  //Question8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side (a) of the triangle:");
        double a = scanner.nextDouble();

        System.out.println("Enter an side (b) of triangle : ");
        double b = scanner.nextDouble();

        System.out.println("Enter the side (c) of the triangle:");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The semi perimeter: " + s);
        System.out.println("The area of the triangle is: " + area);
    }
  }