import java.util.Scanner;
public class OutputLargeNum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int biggestNum;
        biggestNum = 0;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        if ((num1 > num2)&&(num1 > num3)) {
            biggestNum = num1;
        }
        else if ((num2 > num1)&&(num2 > num3)) {
            biggestNum = num2;
        }
        else if ((num3 > num1)&&(num3 > num2)) {
            biggestNum = num3;
        }
        else if ((num1 == num2)&&(num1 == num3)) {
            biggestNum = num1;
        }
        System.out.println(biggestNum);
    }
}
