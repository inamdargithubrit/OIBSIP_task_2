import java.util.Scanner;
import java.util.Random;
public class task_2_game
{
    public static void main(String args[])
    {
        Random rand=new Random();
         Scanner sc=new Scanner(System.in);
        int randomnumber=rand.nextInt(100)+1;
        int i=0,n=5;//trycount=0;
        while(i<n){
            System.out.print("Enter your guess(1-100):");
            int playerguess=sc.nextInt();
            //trycount++;
            if(playerguess==randomnumber)
            {
                System.out.println("Correct! You Win!");
                //System.out.println("It took you "+trycount+" tries");
            }
            else if(randomnumber>playerguess)
            {
                System.out.println("Nope! The number is higher. Guess again.");
            }
            else{
                System.out.println("Nope! The number is lower. Guess again.");
            }
            i++;
        }

    }
}