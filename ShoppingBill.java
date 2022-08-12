import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
  
  private String pname;
  private int qty;
  private double price;
  private double totalPrice;

  Product(String pname, int qty, 
              double price, double totalPrice) {
    this.pname = pname;
    this.qty = qty;
    this.price = price;
    this.totalPrice = totalPrice;
  }

  
  public String getPname() {
    return pname;
  }
  public int getQty() {
    return qty;
  }
  public double getPrice() {
    return price;
  }
  public double getTotalPrice() {
    return totalPrice;
  }

  // displayFormat
  public static void displayFormat() {
    System.out.print(
        "\nName      Quantity    Price   Total Price\n");
  }

  // display
  public void display() {
    System.out.format("%-9s %8d %10.2f %10.2f\n", 
         pname, qty, price, totalPrice);
  }
}

public class ShoppingBill {
  public static void main(String[] args) {
    
    // variables
    String productName = null;
    int quantity = 0;
    double price = 0.0;
    double totalPrice = 0.0;
    double overAllPrice = 0.0;
    char choice = '\0';

    // create Scanner class object
    Scanner scan = new Scanner(System.in);

    List<Product> product = new ArrayList<Product>();

    do {
      // read input values
      System.out.println("Enter product details,");
      System.out.print("Name: ");
      productName = scan.nextLine();
      System.out.print("Quantity: ");
      quantity = scan.nextInt();
      System.out.print("Price (per item): ");
      price = scan.nextDouble();

      //  total price for that product
      totalPrice = price * quantity;

      //  overall price
      overAllPrice += totalPrice;

    
      product.add( new Product(
          productName, quantity, price, totalPrice) );

      
      System.out.print("Want to add more item? (y or n): ");
      choice = scan.next().charAt(0);

      
      scan.nextLine();
    } while (choice == 'y' || choice == 'Y');

    // display all product with its properties
    Product.displayFormat();
    for (Product p : product) {
      p.display();
    }

    
    System.out.println("\nTotal Price = " + overAllPrice);

   
    scan.close();
  }

}