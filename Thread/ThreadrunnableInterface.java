package Thread;
class runnableThread1 implements Runnable{
    public void run(){
     System.out.println("thread 1");
     System.out.println("thread 1");
     System.out.println("thread 1");
     System.out.println("thread 1");

    }
}
class runnableThread2 implements Runnable{
    public void run(){
     System.out.println("thread 2");
     System.out.println("thread 2");
     System.out.println("thread 2");
     System.out.println("thread 2");

    }
}
    public class ThreadrunnableInterface {
    public static void main(String[] args) {
        runnableThread1 t1=new runnableThread1();//bullet
        Thread obj1=new Thread(t1);//gun=>bullet=>fire
        runnableThread2 t2=new runnableThread2();
        Thread obj2= new Thread(t2);
        obj1.start();
        obj2.start();
    }
}
//LifeCycle=>new,runnable,running,non-runnable,terminated