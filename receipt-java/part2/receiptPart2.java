import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class receiptPart2 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("\tPURCHASE RECEIPT SYSTEM");
      System.out.println("\t INPUT DETAILS BELOW");
      
      System.out.println("**********************************");

      System.out.print("Enter Cashier Name:\t");
      scan.next();
      String cashierName = scan.nextLine();
      System.out.print("Enter O.R No:\t\t");
      int orNumber = scan.nextInt();
      
      System.out.println("**********************************");

      System.out.print("Enter Number of Items: ");
      int itemCount = scan.nextInt();

      String[] itemName = new String[itemCount];
      Double[] itemPrice = new Double[itemCount];
      int [] itemQuantity = new int[itemCount];

      for(int i = 0; i < itemCount; i++) {
        System.out.print("Enter Item Name: ");
        itemName[i] = scan.next();
        System.out.print("Enter Item Price: ");
        itemPrice[i] = scan.nextDouble();
        System.out.print("Enter Item Quantity: ");
        itemQuantity[i] = scan.nextInt();
        System.out.println("----------------------------------");
      }

      Double[] totalPayment = new Double[itemCount];
      
      double total = 0;
      double tax = 2.6;

      for(int i = 0; i < itemCount; i++) {
        totalPayment[i] = (itemPrice[i] * itemQuantity[i]);
        total += totalPayment[i];
      }

      System.out.println("TOTAL PAYMENT\tPHP " + (total + tax));
      
      System.out.println("**********************************");

      double payment = 0;

      while(payment < total) {
        System.out.print("Enter Customer Payment: ");
        payment = scan.nextDouble();
      }

      if (payment > total) {
        System.out.println("**********************************");
      }

      scan.close();

      System.out.println("\t     ABC Company");
      System.out.println("      Mc Arthur Highway, Digos City");
      System.out.println("Tel.#: 553 - 2847\tFax: 679652382");
      System.out.println("       GST Reg. No. 000223648294");
      System.out.println("               RCB: 529873290\n");
      System.out.println("   PURCHASE RECEIPT");
      System.out.println("   Cashier: " + cashierName);
      
      Date date = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
      String s = formatter.format(date);
      
      System.out.println("   Date: " + s + "\tO.R No. " + orNumber);
      
      System.out.println("   **********************************");

      System.out.println("   Qty.\t" + "Item/s\t" + "\tPrice/s");
      System.out.println("   ----------------------------------");

      for (int i = 0; i < itemCount; i++) {
        System.out.print("   " + itemQuantity[i] + "\t" + itemName[i] + "\t\t");
        System.out.println(itemPrice[i] * itemQuantity[i]);
      }

      System.out.println("   **********************************");
      System.out.println("   SUBTOTAL\t\t" + total);
      System.out.println("   VAT(5%)\t\t" + tax + "\n");
      System.out.println("   TOTAL\t\t\t" + (total + tax) + "\n");
      System.out.println("   CASH\t\t\t" + payment);

      long change = Math.round(tax);
      
      System.out.println("   CHANGE\t\t" + (total + change - payment));
      System.out.println("\n\tTHANK YOU FOR SHOPPING!");

    } catch(Exception a) {
      System.out.println("\nInvalid Input. Please Try Again...");
    }

  }
}
