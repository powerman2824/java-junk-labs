import java.util.Random;
import java.util.Arrays;

public class Lottery {
    public static void main (String [] args) {
        Random random = new Random();
        int randomNum1;
        int randomNum2;
        int randomNum3;
        int randomNum4;
        int randomNum5;
        int[] array = new int[5];
        randomNum1 = random.nextInt(100);
        randomNum2 = random.nextInt(100);
        randomNum3 = random.nextInt(100);
        randomNum4 = random.nextInt(100);
        randomNum5 = random.nextInt(100);
        array[0] = randomNum1;
        array[1] = randomNum2;
        array[2] = randomNum3;
        array[3] = randomNum4;
        array[4] = randomNum5;
        System.out.println(Arrays.toString(array));
    } 
}