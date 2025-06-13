package Oops;
interface camera {
    void pic();
    private void slowMo(){//smartPhone cannot access this private method
        System.out.println("Slow motion ");
    }
    default void record(){//add new functionality 
        slowMo();//to access private method
        System.out.println("Recording....");
    }
}
interface media{
    void song();
}
interface wifi{
    String[] net();
    void connect(String n);
}
class CellPhone{
    void call(int no){
        System.out.println("calling.."+ no );
    }
    void pick(){
        System.out.println("connecting..");
    }
}
class SmartPhone extends CellPhone implements wifi,camera,media{
    public void pic(){
        System.out.println("click click click");
    }
   /* public void record(){
        System.out.println("snap and Record....");
    }  */
    public void song(){
        System.out.println("playing sajni re!!!");
    }
public String[] net(){
    System.out.println("list of N/W :-");
    String[] list={"anu","vishu","ram","shyaam"};
    return list;
}
public void connect(String n){
    System.out.println("Connecting to"+ n);
}
public void sample(){
    System.out.println("methhodddd");

}
}

public class polymor {
    public static void main(String[] args) {
       camera cam= new SmartPhone();//This is smartphone which is used as camera only
       //cam.net();=>not allowed
       cam.pic();
       cam.record();
      // cam.sample();=>not allowed
        
    }
}
