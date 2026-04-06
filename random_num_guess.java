import java.util.Random;
import java.util.Scanner;
public class random_num_guess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd=new Random();
        while (true) { 
            System.out.println("Enter your Guess number with in 0 -10:");
            int rand=rd.nextInt(10);
            if(rand<=5)
            {
                System.out.println("Hint losser :number is with in 5");
            }
            else{
                                System.out.println("Hint losser :number is greather 5");
            }
            int guess=sc.nextInt();
            if(guess==rand)
            {
                System.out.println("You won but I am powess!!");
                System.out.println("Play again  I will make you again Loser!!");
                String yes_or_no=sc.next();
                if(yes_or_no.equals("no")||yes_or_no.equals("No"))
                {
                       break;
                }
            }
            else{
                System.out.println("You loss Loser!");
                System.out.println("Play again may be you will win next time I am not sure loser..ha.ha..!");
                String yes_or_no=sc.next();
                if(yes_or_no.equals("no")||yes_or_no.equals("no"))
                {
                       break;  }}} }
    }
