package DSA.Hashing;
import java.util.HashMap;
public class FindItineraryFromTickets {
    
     /*find journey path(itinerary) from start to end
      *input=C-->B,M-->D,G-->C,D-->G
      *output=M-->D-->G-->C-->B
      *No loops, and one source-->one destination
      given: from->to
      1.start from one-->to another, then make the to start again and repeat
      2 create reverse map if k,v both are unique, then check both original and reverse map
       */
      

       //start point cannot be the end point
public static String getStart(HashMap<String,String> tick){
    HashMap<String,String> revMap=new HashMap<>();
    
    for(String key: tick.keySet()){
        revMap.put(tick.get(key), key);//value becomes key and key becomes value
    }
    //iterate over original
    for(String key: tick.keySet()){
        if(!revMap.containsKey(key)){//start is unique
            return key;
        }
    }
    return null;

}

      public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start=getStart(tickets);
         while(tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start=tickets.get(start);//make the destination as next start
         }
         System.out.println(start);

      }
}







