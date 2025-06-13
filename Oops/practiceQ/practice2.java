package practiceQ;
interface basicAnimal{
    void eat();
    void step();
}
class monkey{
    public void jump(){
        System.out.println("A monkey jumps froom the terrace");

    }
    public void bite(){
        System.out.println("The monkey bites the boy.");

    }
}
class human extends monkey implements basicAnimal{
    public void eat(){
System.out.println("they eats food for survival");
    }
    public void step(){
        System.out.println("walks on 2 leg");

    }
    void speak(){
        System.out.println("a man speaks");
    }

}
public class practice2 {
    public static void main(String[] args) {
       // human obj=new human();
       monkey obj=new human();
       // obj.eat();
        //obj.step();
        obj.bite();
        obj.jump();
        //obj.speak();
        
    }
}
