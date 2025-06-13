package Oops;
//abstract method is ie declared without implementation
//ek se zyada implement nhi kar sakte
//abstract class is that contains abstract method or simple methods->no object created

abstract class base{//can create reference by dynamic dispatch
    base(){
        System.out.println("constructor of base");
    }
    public void hello(){
        System.out.println("helloo");
    }
    abstract public void greet();
    abstract public void greet2();

}
class parent extends base{//concrete class->object can be created
    @Override
    public void greet(){
        System.out.println("gn");
    }
    @Override
    public void greet2(){
        System.out.println("gm");
    }
}
abstract class grandParent extends base{//no object created
    public void avi(){
        System.out.println("ily");
    }

}
public class abs {
    public static void main(String[] args) {
        //parent obj=new parent();
        parent obj2=new parent();//refernce of abstract class
        obj2.greet();
        obj2.hello();
        
    }
    
}
