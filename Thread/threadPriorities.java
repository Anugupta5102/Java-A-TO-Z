package Thread;
class thr extends Thread{
    public thr(String name){
        super(name);
    }
    public void run(){
        int i=10;
        while ((i<20)) {
            System.out.println("Thread ....."+ this.getName());

        }
    }
}
public class threadPriorities {
    public static void main(String[] args) {
        //ready queue- t1,t2,t3,t4,t5
        thr t1= new thr("anu");
        thr t2=new thr("vishu");
        thr t3=new thr("pankhu");
        thr t4=new thr("ayu");
        thr t5=new thr("golu imp");
        t5.setPriority(Thread.MAX_PRIORITY);//most of the times
        t1.setPriority(Thread.MIN_PRIORITY);//least
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        
    }
}
