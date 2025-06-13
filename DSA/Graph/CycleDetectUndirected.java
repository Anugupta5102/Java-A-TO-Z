package DSA.Graph;
import java.util.ArrayList;
/*Undirected--> BFS,DFS, DSU(Disjoint Set Union)
 * Directed--> DFS,BFS,Topological sort,graph coloring
 */ 
public class CycleDetectUndirected {
    /* 3 types of neighbors--->
     * vis[n]=T, but not parent node -> cycle condition
     * vis[n]=T, and parent node  -> do nothing
     * vis[n]=F -> visit ->T/F
     * 
     * modified DFS-->
     * if(vis[e.dest]=T && par != e.dest) return T
     * if(!vis[e.dest]), if(dfs(graph,vis,e.dest,curr)==T) return T
     */

     public static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
     }

     public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 4));
     }
     //O(V+E)
     public static boolean detectCycle(ArrayList<Edge> graph[],int curr,boolean vis[],int parent){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            //cycle
            if(vis[e.dest] && parent != e.dest){
                return true;
            }
            else if(!vis[e.dest]){
                 if(detectCycle(graph, e.dest, vis, curr)){//curr-> neighbor and parent->curr
                return true;
            }
        }
     }
     return false;
    }
    public static void main(String[] args) {
        int v=6;

        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        System.out.println(detectCycle(graph, 0, new boolean[v], -1));
    }
}
