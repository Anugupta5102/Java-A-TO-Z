package practiceQ;
interface smartTvremote{
    void onn();
    void off();

}
interface tvremote extends smartTvremote{
    void vol();
}
class Tv implements tvremote{
    public void vol(){
        System.out.println("Increase the volume");

    }
    public void onn(){
        System.out.println("switch onn");

    }
    public void off(){
        System.out.println("switch off");

    }
}
    public class practice3 {
    public static void main(String[] args) {
        Tv obj=new Tv();
        obj.onn();
        obj.vol();
        obj.off();
    }
}
