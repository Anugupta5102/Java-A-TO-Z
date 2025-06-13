package Thread;
//concurrent thread run at same time=>multithreading
class mythread1 extends Thread{//using Thread class
    @Override
   public void run(){
    int i=1;
    while (i<10) {
        System.out.println("1 is running");
        System.out.println("still 1 running");   
    }
 }
}
class mythread2 extends Thread{
    @Override
   public void run(){
    int i=1;
    while (i<10) {
        System.out.println("2 is running");
        System.out.println("still 2 running");   
    }
 }
}
public class thread {
    public static void main(String[] args) {
        mythread1 obj1=new mythread1();
        mythread2 obj2= new mythread2();
        obj1.start();//initialize/ start process
        obj2.start();
    }
    
}
