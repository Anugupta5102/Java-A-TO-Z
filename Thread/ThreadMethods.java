package Thread;
class thr1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thread ....."+ this.getName());
            try {
                Thread.sleep(500);

                
            } catch (InterruptedException e) {
                //  handle exception
                e.printStackTrace();

            }
        }
    }
}
class thr2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("My Thread ....."+ this.getName());

        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        thr1 t1=new thr1();
        thr2 t2=new thr2();
        t1.start();
       /*  try{
            t1.join();//not start t2 until t1 finishes ; can throw exception

        }
        catch(Exception e){
            System.out.println(e);
        } */
        
        t2.start();


    }
}
