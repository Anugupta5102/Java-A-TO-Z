package DSA.Graph;
/* Shortest path algorithm 
 * work on BFS ,-->Queue/Priority queue--->priority to smaller no.
 * pair(node,dist)
 *  greedy algo
 * from given Source(u) to all vertices(v) in weighted graph
 * Relaxation-> update distance
 * dis[u]+wt < dis[v], then update wt od dest(v)
 * dis[v] = dis[u]+wt
 * INITIALIZE->
 * pq.add([0,0]);    //node,dist
 * dis[]->infinity at start
 * vis[]
 * 
*/
import java.util.ArrayList;
import java.util.PriorityQueue;
/*Does not work for -ve weight */
public class Dijkstra {
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
        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 3,7));
        graph[2].add(new Edge(2, 4,3));
        graph[3].add(new Edge(3, 5,1));
        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));
    }
    //to store each node with its distance
    public static class Pair implements Comparable<Pair>{//compare pairs
        int node;
        int dist;

        public Pair(int n,int d){
            this.node=n;
            this.dist=d;
        }
        /* +ve o/p means--->this is greater
         * -ve o/p means--->this is smaller
         * 0 o/p means--->equal
         */
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; //compare on basis of dist(ascending)
            //return p2.dist - this.dist; -->descending
        }

    }

    //O(E + ElogV)--->pq->ElogV
    public static void shortestDistance(ArrayList<Edge> graph[],int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<> ();
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;//infinity
            }
        }
        boolean vis[]=new boolean[V];
        pq.add(new Pair(src, 0));
        //bfs
        while( !pq.isEmpty()){
            Pair curr=pq.remove();//smallest
            if(!vis[curr.node]){ 
                vis[curr.node]=true;
                
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    //relaxation
                    if(dist[u]+e.wt < dist[v]){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        shortestDistance(graph, 0, V);
        
    }

}
