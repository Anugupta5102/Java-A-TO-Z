package practiceQ;
import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userInput=sc.nextInt();
        Random r=new Random();
        int compInput=r.nextInt(3);

        if(userInput == compInput){
            System.out.println("Tie");
        }
        else if(userInput == 0 && compInput ==2 || userInput ==1 && compInput == 0 || userInput ==2 && compInput ==1){
            System.out.println("You Win");

        }
        else{
            System.out.println("Computer win");
        }
        System.out.println("Computer choice:"+ compInput);

    }
}
