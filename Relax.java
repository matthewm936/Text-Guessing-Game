
import java.util.Scanner;

public class Relax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose to play game");
        System.out.println("guessing game or no game");
        System.out.println("game to play - no to not play");
        String userInput = scan.nextLine();
        if(userInput.contains("game")) {
            MultipleClassesNoFun.Game();
        } else {
            System.exit(0);
        }

    }

}
