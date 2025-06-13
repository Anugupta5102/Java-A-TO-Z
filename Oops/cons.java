package Oops;

class Emp{
    private int id;
    private String name;
// constructor
    public Emp(){
        id=13;
        name="ANU";
    }
    //parameterized constructor
    public Emp(String naam){
        id= 21;
        name= naam;
    }
    public Emp(String naam, int sr){
        id= sr;
        name= naam;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i)
    {
        id=i;
    }
}
public class cons {
    public static void main(String[] args) {
        //constructor object
      Emp obj= new Emp("ayush", 45);

      //obj.setId(55);
      //obj.setName("Vishu");
      System.out.println(obj.getId());//13
      System.out.println(obj.getName());//anu
        
    }
}
