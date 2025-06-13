package DateTimeCalendar;

import java.util.Date;
public class dateTime {
    //1900 starting year for java
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);//safe to store time in long millisec
        System.out.println(System.currentTimeMillis());//millisec
        System.out.println(System.currentTimeMillis()/1000);//sec
        System.out.println(System.currentTimeMillis()/1000/3600);//min
        System.out.println(System.currentTimeMillis()/1000/3600/24);//day
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);//yr
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());//ms
        System.out.println(d.getYear());



    }
}
