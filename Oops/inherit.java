//extends for inheritance
package Oops;

class base{
    base(){
        System.out.println("constructor of base class");
    }
    base(int x){
        System.out.println("value of a:"+ x);
    }
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I'm in base ");
    }
}
class derived extends base {
    derived(){
        super(5);//access parameterised base class constructor
        System.out.println("constructer of derive class");
    } //inheritance
    derived(int x, int y){
        super(x);
        System.out.println("overloaded constuctor"+y);
    }
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
}
class sub extends derived{
    sub()
    {
        System.out.println("subclass of derive");
    }
    sub(int x, int y, int z){
        super(x,y);
        System.out.println("value of z:"+z);
    }
}
    public class inherit {
    public static void main(String[] args) {
        base b= new base();
        b.setX(4);
        System.out.println(b.getX());
        //obj of derived class
        //derived d= new derived();
        derived d= new derived(5,9);
        d.setX(90);
        System.out.println(d.getX());
       
       // sub s=new sub();
        sub s=new sub(12,24,50);


    }
}
