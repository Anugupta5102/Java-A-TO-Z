package DSA.Graph;
/*Does not work for -ve weight cycle */
import java.util.ArrayList;

/*Shortest distance algo
 * for negative weights and positive weights
 * work on DP(dynamic programming)
 * more TC than Dijkstra
 * loop for (v-1) times
 * O(V*E)-TC
 */
public class BellmanFord {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));
        graph[1].add(new Edge(1, 2,-4));
        graph[2].add(new Edge(2, 3,2));
        graph[3].add(new Edge(3, 4,4));
        graph[4].add(new Edge(4, 1,-1));//-10 ,then -ve wt cycle
    }

    public static void bellman(ArrayList<Edge> graph[],int src, int V){
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if( i != src){
                dist[i]=Integer.MAX_VALUE;//infinity at start
            }
        }
        for(int k=0;k<V-1;k++){ //O(V)
            //O(E)
            for(int i=0;i<V;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                    }
                }
            }
        }
        //detect -ve wt cycles
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                int u=e.src;
                int v=e.dest;
                //relaxation
                if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){
                System.out.println("Negative weight cycle");                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }


    
    public static void main(String[] args) {
        int V=5;//v-1=(6-1)--->max dis b/w any 2 nodes

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        bellman(graph, 0, V);
    }
    
}
