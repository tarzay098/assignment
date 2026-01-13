import java.util.Scanner;
//Question5

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the voltage: ");
        double voltage = scanner.nextDouble();
        
        System.out.print("Enter the current: ");
        double current = scanner.nextDouble();
        double power = voltage * current;

        System.out.println("The power is: " + power);

        scanner.close();
        System.out.println("GoodBye :)");
    }

    
}
