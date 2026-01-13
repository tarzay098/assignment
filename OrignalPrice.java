import java.util.Scanner;
public class OrignalPrice {
  //Question4 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();
        System.out.println("Enter the discount percentage: ");
        double discount = sc.nextDouble();
        double discountAmount = (discount / 100) * sellingPrice;
        double originalPrice = sellingPrice + discountAmount;
        System.out.println("The original price is: " + originalPrice);
   
   sc.close();
   System.out.println("Thank you!");
   
}

}
