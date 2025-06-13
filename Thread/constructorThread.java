package Thread;
class thr extends Thread{
    public thr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread .....");
    }
}
public class constructorThread {

    public static void main(String[] args) {
        thr t= new thr("anu");
        thr t2=new thr("vishu");
        t.start();
        t2.start();
        System.out.println("ID is:" + t.getId());
        System.out.println("name is:"+t.getName());
        System.out.println("ID is:" + t2.getId());
        System.out.println("name is:"+t2.getName());
    }
}