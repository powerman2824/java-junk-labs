import java.util.Scanner;
public class DivideByTwoLoop {
    public static void main(String[] agrs) {

      Scanner scnr = new Scanner(System.in);
      int userNum;

      userNum = scnr.nextInt();

      if (userNum > 0){
         while(userNum != 1){
            System.out.print(userNum / 2);
            System.out.print(" ");
            userNum = userNum /2;
            }
         }

         System.out.println("");
}
    }
