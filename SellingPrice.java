import java.util.Scanner;
public class SellingPrice {
    //Question3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the orignal selling price: ");
         double value = scanner.nextDouble();
        System.out.println("Enter the discount percentage: ");
         double discount = scanner.nextDouble();
        double discountAmount = (discount / 100) * value;
        double sellingPrice = value - discountAmount;

        System.out.println("The selling price after discount is: " + sellingPrice);


        scanner.close();
 
    }
}
