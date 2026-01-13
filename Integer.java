import java.util.Scanner;

public class Integer {
    //Question7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
 
       }
 
       sc.close();
       System.out.println("Program ended.");
    }

}
