package Oops;

interface sample{
    void meth1();
    void meth2();
}
interface child extends sample{//inheritance
    void meth3();
}
class MySample implements child{//implementing interface
    public void meth3(){
        System.out.println("methd 3 of child");
    }
    public void meth1(){
        System.out.println("methd 1 of sample");
    }
    public void meth2(){
        System.out.println("methd 2 of sample");
    }
}

public class ineritanceInterface {
    public static void main(String[] args) {
        MySample obj=new MySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        
    }
}
