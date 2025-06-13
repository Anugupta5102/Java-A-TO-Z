package practiceQ;
import java.util.Random;
import java.util.Scanner;
class game{
    public int num;
    public int inp;
    public int noGuess;
    public int getnoGuess(){
        return noGuess;
    }
    public void setnoGuess(int noGuess){
        this.noGuess=noGuess;
    }
    game(){
        Random r= new Random();
        this.num=r.nextInt(100);
    }
    void takeUserip(){
        System.out.println("guess no");
        Scanner sc= new Scanner(System.in);
        inp=sc.nextInt();

    } 
    Boolean isCorrect(){
        if(inp==num){
            return true;
        }
        else if(inp<num){
            System.out.println("too low");
        }
        else if(inp>num){
            System.out.println("too high");
        }
        return false;

    }
}
public class guess {
    public static void main(String[] args) {
        game g = new game();
        boolean b= false;
        while (!b) {
            g.takeUserip();
         b=g.isCorrect();
        System.out.println(b);
        }
        
    }
}
