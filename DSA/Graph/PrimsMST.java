package DSA.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

/*MST set --->vis[]
non-MST set--->priority queue
O(ElogE)
*/
public class PrimsMST {
    /*mim wt tree is subset of graph,connecting all vertices without any cycles
     *with min possible total edge wt(min cost) 
     * connected ,undirected, weighted graph
     * 2 algo- prims and kruskals
     * priority queue-->min cost
    */
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
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));


        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));

        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2, 3,50));

        graph[3].add(new Edge(4, 1,40));
        graph[3].add(new Edge(4, 2,50));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n,int c){
            this.node=n;
            this.cost=c;
        }

        @Override
        public int compareTo(Pair c2){
            return this.cost - c2.cost;//ascending order sort

        }
        
    }



    public static void prims(ArrayList<Edge> graph[],int V) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();//node,cost
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0, 0));

        int minCost=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();//min
            if(!vis[curr.node]){
                vis[curr.node]=true;
                minCost += curr.cost;

                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum cost is: "+ minCost);
    }

    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        prims(graph, V);
    }
    
}
