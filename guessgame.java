import java.util.Scanner;
import java.util.Random;
public class guessgame
{
        public static void main(String[]args)
        {
                System.out.println("\t\t**GUESS GAME**");
                Scanner pg = new Scanner(System.in);
                Random rnd = new Random();
                System.out.println("ENTER THE MAXIMUM RANGE");
                int  range = pg.nextInt();
                System.out.println("No of chances: "+(range/3));
                int rn = rnd.nextInt(range);
                System.out.println("GUESS THE NUMBER\n *ENTER 9999 TO QUIT*");
                int i=1;
                while(i<=(range/3))
                {
                int guess = pg.nextInt();
                if(guess==9999)
                {
                break;
                }
                else if(guess>rn)
                {
                System.out.println("TOO HIGH...retry");
                }
                else if(guess==rn)
                {
                System.out.println("!!!You guessed it right!!!\n");
                break;
                }
                else
                {
                System.out.println("TOO LOW...retry");
                }
                i++;
                }
                System.out.println("THE RANDOM NO. WAS: "+rn);
                System.out.println("Thanks for playing...\n*EXITING...*");
        }
}