package practiceQ;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

class practiceSet{
    public static void main(String[] args) {
        ArrayList<String> ar= new ArrayList<>();
        ar.add("anu");
        ar.add("vishu");
        ar.add("pia");
        ar.add("ayush");
        ar.add("adi");
        ar.add("tanu");
        for (Object o : ar) {
            System.out.println(o);
            
        }
        HashSet<Integer> h=new HashSet<>();
        h.add(5);
        h.add(10);
        h.add(15);
        h.add(20);
        h.add(5);
        for (Object ob : h) {
            System.out.println(ob);
            
        }
        Date d= new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+"/"+c.get(Calendar.MINUTE)+"/"+c.get(Calendar.SECOND));
        
        LocalDateTime dt = LocalDateTime.now();//date
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");//formatter
        String mydate= dt.format(dtf);
        System.out.println(mydate);

     }

}