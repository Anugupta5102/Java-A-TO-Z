package recursion;

public class InviteGuestInSingleOrPairs {

    public static int invite(int n){
        if(n <= 1){
            return 1;
        }
        int single=invite(n-1);
        int pairs=(n-1)*invite(n-2);

        return single+pairs;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total ways : " +invite(n));
        
    }
}
