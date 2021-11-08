package exercises;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class Main {

    public static void main(String[] args) {

        //Setting up the Scanner so we can use user input
        Scanner scanner = new Scanner(System.in);
        //Printing the first question
        System.out.println("Random seed the generator (y/n)? ");
        //Setting up the string a to check if our first question get answered with yes or no
        String a = scanner.next();
        //If the first question gets answered with yes we enter the if loop
        if (a.equals("y")) {
            //Setting up a random number for the first question
            int int_random = ThreadLocalRandom.current().nextInt();
            System.out.println(int_random);
            //Because we answered the first question with yes, we enter the while loop to keep asking if we want another number
            //We keep staying in the while loop as long we keep answering the next questions with yes
            while (true) {
                //Setting up a second random number that gets changed every loop to ensure we get a different number every question
                int int_random2 = ThreadLocalRandom.current().nextInt();
                //
                System.out.println("Another random number (y/n)? ");
                String s = scanner.next();
                if (!s.equals("y")) break;
                    System.out.println(int_random2);
            }
        } else {
            return;
            }

    }
}