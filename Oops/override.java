//same func in base and derive class
//@Override
package Oops;

class A{
    String name;
    int id;
    public void meth1(String s){
        name=s;
        System.out.println(name);
        
    }
    public void meth2()
    {
        System.out.println("method 2 of A");
    }
}
class B extends A{
    @Override
    public void meth2()
    {
        System.out.println("method 2 of B");
    }
}
public class override{
    public static void main(String[] args) {
        A obj =new A();
        obj.meth1("anu");
        obj.meth2();

        B ob =new B();
        ob.meth2();
        
    }
}