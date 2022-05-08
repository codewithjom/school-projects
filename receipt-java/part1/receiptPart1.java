import java.util.Scanner;

public class receiptPart1 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int count;
    double total = 0;

    System.out.println("-----< INPUT >-----");
    System.out.print("Enter number of items: ");
    count = scan.nextInt();

    String[] product = new String[count];
    Double[] quantity = new Double [count];
    Double[] price = new Double [count];
    Double[] output = new Double [count];

    for(int i = 0; i < count; i++) {
      System.out.println("----------");
      System.out.print("Product name: ");
      product[i] = scan.next();
      System.out.print("Quantity: ");
      quantity[i] = scan.nextDouble();
      System.out.print("Price: ");
      price[i] = scan.nextDouble();
    }

    System.out.println("-----< OUTPUT >-----");
    System.out.println("ITEM\t\tQTY.\tPRICE\tSUBTOTAL");

    for(int i = 0; i < count; i++) {
      System.out.print(product[i]+ "\t\t" + quantity[i]+ "\t\t" + price[i] + "\t\t\t");
      System.out.println((quantity[i] * price[i]));
      output[i] = (quantity[i] * price[i]);
      total += output[i];
    }

    System.out.println("\n->TOTAL: PHP" + total);

  }
}
