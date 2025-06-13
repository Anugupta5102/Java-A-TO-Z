package practiceQ;
class circle{
    public int radius;
    circle(int r)
    {System.out.println("parameterised constructor");
        radius=r;

    }
    public double areaaa(){
        return Math.PI*radius*radius;

    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println("cylinder constructor");
        height=h;

        
    }
    public double vol(){
        return Math.PI*radius*radius*height;

    }
}
    public class area {
    public static void main(String[] args) {
        //circle obj =new circle(5);
        cylinder obj=new cylinder(5,4);
        obj.areaaa();

    }
}
