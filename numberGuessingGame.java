import java.util.*;
public class numberGuessingGame {
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        Random random=new Random();
        int lowerBond=1;
        int upperBond=100;
        int numberToGuess=random.nextInt(upperBond - lowerBond + 1) + lowerBond;
        int attempts=0;
        int maxAttempts=10;
        int score=100;
        while(attempts<maxAttempts){
            System.out.println("Enter Your Guess: ");
            int userGuess= sc.nextInt();
            attempts++;
            if (userGuess == numberToGuess)
            {
                System.out.println("Conguralations! You Guessed the number "+ numberToGuess +" in "+ attempts +" attempts");
                System.out.println("The Scors is : "+score);
                break;
            }

            else if (userGuess < numberToGuess){
                System.out.println("Try a Higher Number");
            }

            else {
                System.out.println("Try a Lower Number");
            }

            score -= 10;
        }

        if (attempts >= maxAttempts){
            System.out.println("Sorry, You Have Reached The Maximum Attempts.The number was :"+numberToGuess);
        }
        sc.close();
    }
}
