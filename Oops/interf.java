//interfaces is grp of related methods with empty body -no object only reference
//implements for using interface 
//ek se zyada implement kar sakte h
//methods and properties are public
package Oops;

interface cycle{
    int a =10; 
    void brake(int dec);
    void speed(int inc);
}
interface Motorcycle{
    void blowHorn();
    void speedUp();
}
class hero implements cycle, Motorcycle{
    void horn(){
        System.out.println("pee peep");
    }
    int sp=7;
    public void brake(int dec){//public 
        System.out.println("brake maar");
        sp=sp-dec;
    }
   public void speed(int inc){
        System.out.println("speed badhaa");
        sp=sp+inc;
    }
    public void blowHorn()
    {
        System.out.println("poo poo");
    }
    public void speedUp(){
        System.out.println("100km/hr");
    }
}
public class interf {
    public static void main(String[] args) {
        hero obj=new hero();
        obj.brake(2);
        System.out.println(obj.a);
        obj.blowHorn();
        obj.speedUp();
        //cannot change properties becoz they are final
    }

}
