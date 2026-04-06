import java.util.Random;
import java.util.Scanner;
public class rock_paper_sissor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int user_choice;
        int computer_choice = rnd.nextInt(3) + 1; // random number 1..3
        System.out.println("Enter the choice: 1 for rock ,2 for paper and 3 for sissor");
        user_choice = sc.nextInt();
        while(true){
        if(user_choice==computer_choice){
            System.out.println("Match Draw");
        }
        else if(user_choice==1 && computer_choice==3){
            System.out.println("You won!");
            break;
        }
        else if(user_choice==2 && computer_choice==1){
            System.out.println("You won!");
            break;
        }
        else if(user_choice==3 && computer_choice==2){
            System.out.println("You won!");
            break;
        }
        else{
            System.out.println("You lost!");
            break;
        }
    }
    }
}
