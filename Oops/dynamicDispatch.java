package Oops;
class parent{
    public void name(){
        System.out.println("ANU");
    }
    public void greet(){
        System.out.println("good evening");
    }
}
class child extends parent{
    public void welcome(){
        System.out.println("hello");
    }
    @Override
    public void name(){
        System.out.println("ANUSHREE");
    }

}
public class dynamicDispatch {
    public static void main(String[] args) {
       // parent obj =new parent();
        //child ob= new child(); 
        //obj.name();
        parent obj= new child();
        obj.name();
        obj.greet();
        //obj.welcome(); not allowed
    }
}
