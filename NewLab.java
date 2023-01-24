import java.util.Scanner; 
public class NewLab {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int userNum = 0;
        int maxNum = 0;
        float average = 0;
        int numOfInts = 0;
        while (!(userNum <= -1)) {
           userNum = scrn.nextInt();
           if (!(userNum <= -1)) {
            average = userNum + average;
           }
           numOfInts = numOfInts + 1;
           if (userNum > maxNum) {
              maxNum = userNum;
              }
           }
           numOfInts = numOfInts - 1;
           average = average / numOfInts;
        System.out.print(maxNum);
        System.out.print(" ");
        System.out.printf("%.2f\n", average);
     }
}
