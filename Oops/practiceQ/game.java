package practiceQ;
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");
         int user=sc.nextInt();
         Random r=new Random();
        int comp=r.nextInt(3);
        if(user == comp){
            System.out.println("Draw/Tie");
        }
        else if( user==0 && comp==2|| user == 1 && comp==0 || user==2&& comp==1){
            System.out.println("You Win!!");
        }
         System.out.println("Computer's input was:"+ comp);   
}
}
