import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner srcn = new Scanner(System.in);
        int userNum = 0;
        userNum = srcn.nextInt();

        if ((userNum >= 11)&&(userNum <= 100)) {
            while (!(userNum % 11 == 0)) {
                System.out.print(userNum);
                userNum = userNum - 1;
                System.out.print(" ");
            }
            System.out.print(userNum + " \n");
        }
        else {
            System.out.print("Input must be 11-100\n");
        }
    }
}
