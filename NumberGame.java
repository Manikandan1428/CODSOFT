import java.util.Scanner;
import java.util.Random;
/**
 * NumberGame
 */
public class NumberGame {

    public static void main(String[] args) {
          Scanner scn= new Scanner(System.in);
          System.out.println("Number Game:");
          System.out.println("------ ----");
          System.out.println();
          System.out.println("Instructions:");
          System.out.println();
          System.out.println("1. Five attempts will be given.\n2. You will be provided with full score initially(5/5).\n3.For every wrong attempts ,your score will be reduced by 1.");
          System.out.println();
          System.out.println("Your five attempts starts now: ");
          System.out.println();
          int attempts=0;
          while(true){
            Random random = new Random();
            int ran = random.nextInt(100);
            for (int i = 1; i <= 5; i++) {
                
                System.out.print("Attempt "+i+": ");
                System.out.print("Guess the random number: ");
                int num = scn.nextInt();

                if(num==ran){

                    System.out.println("Wow!You got it.");
                    System.out.println("Your final score is"+" "+(5-attempts)+"/"+"5");
                    break;

                }
                else if(num<ran){

                    System.out.println("Your guess was too low");

                }
                else{

                    System.out.println("Your guess was too high");

                }
                attempts++;
                System.out.println("Your score reduced to"+" "+(5-attempts)+"/"+"5");
            }
            attempts=0;
            System.out.println("Do you want to play again?");
            System.out.println("Press 1:yes or Press 0:No");
            int cnt=scn.nextInt();

            if(cnt==1){

                continue;

            }
            else{

                System.out.println("Thanks for playing!");
                break;

            }
            
        }
    }
}