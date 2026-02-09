import java.util.*;
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()*100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 100");
        while (attempts < 7)
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess < number)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess > number)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
                break;
            }
            System.out.println("Attempts left: " + (7 - attempts));
        }
        if(guess != number)
        {
            System.out.println("You have exceeded attempts. The number was: " + number);
        }
        sc.close();
    }
}