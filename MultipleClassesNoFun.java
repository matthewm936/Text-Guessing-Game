import java.util.Random;
import java.util.Scanner;

public class MultipleClassesNoFun {
    public static void main(String[] args) {

    }
    public static void Game() {
        System.out.println("u play game");
        System.out.println("guess a number between 0 - 25");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(25);
        while(true) {
            int currInt = scan.nextInt();
            if(currInt == number) {
                System.out.println("winner");
                System.exit(1);
                break;
            } else {
                if(currInt > number) {
                    System.out.println("guess lower");
                }
                if(currInt < number) {
                    System.out.println("guess higher");
                }
            }
        }
    }
}
