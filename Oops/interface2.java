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
 interface gps{
    void track();
    void loc();

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
class SmartPhone extends CellPhone implements wifi,camera,gps,media{
    public void pic(){
        System.out.println("click click click");
    }
   /* public void record(){
        System.out.println("snap and Record....");
    }  */
    public void track(){
        System.out.println("you are at home");
    }
    public void loc(){
        System.out.println("lko");
    }
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
}

public class interface2 {

    public static void main(String[] args) {
        SmartPhone obj=new SmartPhone();
        String ar[]=obj.net();
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        obj.connect(" anu");
        //obj.slowMo();    => error
        obj.pic();
        obj.track();
        obj.song();
        obj.record();
    }
}