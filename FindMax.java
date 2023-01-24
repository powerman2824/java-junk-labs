import java.util.Scanner;

public class FindMax {
   public static void main (String [] args) {
    Scanner scnr = new Scanner(System.in);
    int userAge;

    userAge = scnr.nextInt();

    while (userAge < 18 || userAge > 35) {
       if (userAge < 18) {
          System.out.println("Too young");
       }
       else {
          System.out.println("Already adult");
       }
       userAge = scnr.nextInt();
    }

    System.out.print("Perfect fit");
   }
}