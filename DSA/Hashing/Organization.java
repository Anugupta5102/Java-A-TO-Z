package DSA.Hashing;
/*write a function that takes department as parameter and return all its parent whose size > 3 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organization {
    public static final Map<String,String> org=new HashMap<>();
      static{
        org.put("Engineering","Company");
        org.put("HR", "Company");
        org.put("Sales", "Company");
        org.put("Frontend", "Engineering");
        org.put("Backend", "Engineering");
        org.put("DevOps", "Engineering");
        org.put("Recruitment", "HR");
        org.put("Training", "HR");
        org.put("DomesticSales", "Sales");
        org.put("InternationalSales", "Sales");
        org.put("Support", "Backend");
    }
    public static List<String> getParent(String dept){
        List<String> parents=new ArrayList<>();
        String curr=dept;

        while(org.containsKey(curr)){
            String parent=org.get(curr);

            if(parent.length() > 3){
                parents.add(parent);
            }

            curr=parent;
        }
        return parents;
    }
    public static void main(String[] args) {
        // Example usage
        String department = "Support";
        List<String> result = getParent(department);

        System.out.println("Parent departments with more than 3 characters: " + result);
    }
}

    // public static void main(String[] args) {
    //     Map<String, List<String>> heirarchy=new HashMap<>();
    //     heirarchy.put("HR", Arrays.asList("Admin"));
    //     heirarchy.put("Admin", Arrays.asList("Management"));
    //     heirarchy.put("Management", Arrays.asList("Executive"));
    //     heirarchy.put("Executive", Arrays.asList());

    //     //test
    //     String dept="HR";
    //     List<String> res=getParent(dept,heirarchy);
    //     System.out.println(res);

    // }

    // public static List<String> getParent(String department, Map<String, List<String>> hierarchy) {
    //     List<String> res=new ArrayList<>();
    //    if(department == null || hierarchy.containsKey(department)){
    //     return res;
    //    }
    //    Queue<String> q=new LinkedList<>();
    //    Set<String> visited=new HashSet<>();

    //    q.add(department);
    //    visited.add(department);

    //    while(!q.isEmpty()){
    //     String curr=q.poll();
    //     List<String> parents=hierarchy.get(curr);

    //     if(parents != null){
    //         for(String par:parents){
    //             if(par.length() > 3 && !visited.contains(par)){
    //                 res.add(par);
    //                 q.add(par);
    //                 visited.add(par);
    //             }
    //         }   
    //     }
    // }
    // return res;
    // }
}
