import java.util.Scanner;
public class RemoveRGB {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        int smallInt;
        smallInt = 0;

        if ((num1 < num2)&&(num1 < num3)) {
            smallInt = num1;
        }
        else if ((num2 < num1)&&(num2 < num3)) {
            smallInt = num2;
        }
        else if ((num3 < num1)&&(num3 < num2)) {
            smallInt = num3;
        }
        else if ((num1 == num2)&&(num1 == num3)) {
            smallInt = num1;
        }
        System.out.println((num1 - smallInt) + " " + (num2 - smallInt) + " " + (num3 - smallInt));

    }
}
