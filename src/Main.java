import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        System.out.println(scanner.nextInt());

        // This will give a random number between 1 and 3, inclusive.
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);


        System.out.println(randomNum);



    }




}
