package practiceQ;
class circle{
    int l;
    int b;
    String name;

    public void setSize(int x, int y){
    l= x;
    b= y;
}
    public int getSize(){
        int a=l*b;
        return a;

    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
}
public class Shape {
    public static void main(String[] args) {
        circle obj= new circle();
        obj.setName("square");
        obj.setSize(2,3 );
        System.out.println(obj.getName());
        System.out.println(obj.getSize());
    }
}
