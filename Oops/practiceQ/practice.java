package practiceQ;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountain extends pen{
    void write(){
        System.out.println("I am writing....");

    }
    void refill(){
        System.out.println("Refilling the pen with blue ink....");

    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class practice {
    public static void main(String[] args) {
        
        fountain p= new fountain();
        p.write();
        p.refill();
        p.changeNib();
    }
}
