package DSA.Graph;
/*Undirected--> BFS,DFS, DSU(Disjoint Set Union)
 * Directed--> DFS,BFS,Topological sort,graph coloring
 */
import java.util.ArrayList;

public class CycleDetectDirected {
    public static class  Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    public static boolean hasCycleDir(ArrayList<Edge> graph[],int curr, boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true; //recursion stack

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //cycle
            if(stack[e.dest]){ //if neighbor==true ie already visited and in rec stack
                return true;
            }
            else if(!vis[e.dest]){
                if(hasCycleDir(graph, e.dest, vis, stack)){
                return true;
                }
            }
        }
        stack[curr]=false; //backtrack
        return false;
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        //if graph disconnected
        boolean vis[]=new boolean[v];
        boolean stack[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                boolean res= hasCycleDir(graph, 0, vis, stack);
                if(res){
                System.out.println("Is the graph has cycle: " + res);
                break;
            }
        }
    }
    
}
}
